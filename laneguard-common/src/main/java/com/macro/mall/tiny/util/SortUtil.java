package com.macro.mall.tiny.util;

import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;

import cn.hutool.core.io.IoUtil;
import lombok.SneakyThrows;

/**
 * @ClassName SortUtil
 * @Author WB-918966
 * @Date 2022/10/21 14:00
 * @Version 1.0
 * 自定义排序工具
 **/
public class SortUtil  {
    public static final String DESC = "desc";
    public static final String ASC = "asc";

    @SneakyThrows
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(下发到哥伦布, 应用id: (\\d+))");
        FileReader fileReader = new FileReader("/Users/laneguard/Desktop/log/data.txt");
        String read = IoUtil.read(fileReader);
        List<String> arr = new ArrayList<>();
        Matcher matcher = compile.matcher(
            read);
        while (matcher.find()){
            arr.add(matcher.group(2));
        }
        List<String> collect = arr.stream().distinct().collect(Collectors.toList());
        System.out.println(JSON.toJSONString(collect));
        System.out.println(collect.size());
    }

    /**
     * 对list中的元素按升序排列.
     *
     * @param list 排序集合
     * @param field 排序字段
     * @return
     */
    public static List<?> sort(List<?> list, final String field) {
        return sort(list, field, null);
    }

    /**
     * 对list中的元素进行排序.
     *
     * @param list 排序集合
     * @param field 排序字段
     * @param sort 排序方式: SortList.DESC(降序) SortList.ASC(升序).
     */
    @SuppressWarnings("unchecked")
    public static List<?> sort(List<?> list, final String field,
        final String sort) {
        Collections.sort(list, new Comparator() {
            public int compare(Object a, Object b) {
                int ret = 0;
                try {
                    Field f = a.getClass().getDeclaredField(field);
                    f.setAccessible(true);
                    Class<?> type = f.getType();

                    if (type == int.class) {
                        ret = Integer.compare(f.getInt(a), f
                            .getInt(b));
                    } else if (type == double.class) {
                        ret = Double.compare(f.getDouble(a), f
                            .getDouble(b));
                    } else if (type == long.class) {
                        ret = Long.compare(f.getLong(a), f
                            .getLong(b));
                    } else if (type == float.class) {
                        ret = Float.compare(f.getFloat(a), f
                            .getFloat(b));
                    } else if (type == Date.class) {
                        ret = ((Date) f.get(a)).compareTo((Date) f.get(b));
                    } else if (isImplementsOf(type, Comparable.class)) {
                        ret = ((Comparable) f.get(a)).compareTo(f
                            .get(b));
                    } else {
                        ret = String.valueOf(f.get(a)).compareTo(
                            String.valueOf(f.get(b)));
                    }

                } catch (SecurityException | NoSuchFieldException | IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
                if (sort != null && sort.equalsIgnoreCase(DESC)) {
                    return -ret;
                } else {
                    return ret;
                }

            }
        });
        return list;
    }

    /**
     * 对list中的元素按fields和sorts进行排序,
     * fields[i]指定排序字段,sorts[i]指定排序方式.如果sorts[i]为空则默认按升序排列.
     *
     * @param list
     * @param fields
     * @param sorts
     */
    @SuppressWarnings("unchecked")
    public static List<?> sort(List<?> list, String[] fields, String[] sorts) {
        if (fields != null && fields.length > 0) {
            for (int i = fields.length - 1; i >= 0; i--) {
                final String field = fields[i];
                String tmpSort = ASC;
                if (sorts != null && sorts.length > i && sorts[i] != null) {
                    tmpSort = sorts[i];
                }
                final String sort = tmpSort;
                Collections.sort(list, new Comparator() {
                    public int compare(Object a, Object b) {
                        int ret = 0;
                        try {
                            Field f = a.getClass().getDeclaredField(field);
                            f.setAccessible(true);
                            Class<?> type = f.getType();
                            if (type == int.class) {
                                ret = ((Integer) f.getInt(a))
                                    .compareTo(f.getInt(b));
                            } else if (type == double.class) {
                                ret = ((Double) f.getDouble(a))
                                    .compareTo(f.getDouble(b));
                            } else if (type == long.class) {
                                ret = ((Long) f.getLong(a)).compareTo(f
                                    .getLong(b));
                            } else if (type == float.class) {
                                ret = ((Float) f.getFloat(a))
                                    .compareTo(f.getFloat(b));
                            } else if (type == Date.class) {
                                ret = ((Date) f.get(a)).compareTo((Date) f
                                    .get(b));
                            } else if (isImplementsOf(type, Comparable.class)) {
                                ret = ((Comparable) f.get(a))
                                    .compareTo(f.get(b));
                            } else {
                                ret = String.valueOf(f.get(a)).compareTo(
                                    String.valueOf(f.get(b)));
                            }

                        } catch (SecurityException | NoSuchFieldException | IllegalArgumentException | IllegalAccessException e) {
                            e.printStackTrace();
                        }

                        if (sort != null && sort.equalsIgnoreCase(DESC)) {
                            return -ret;
                        } else {
                            return ret;
                        }
                    }
                });
            }
        }
        return list;
    }

    /**
     * 默认按正序排列
     *
     * @param list
     * @param method
     */
    public static List<?> sortByMethod(List<?> list, final String method) {
        return sortByMethod(list, method, null);
    }

    @SuppressWarnings("unchecked")
    public static List<?> sortByMethod(List<?> list, final String method,
        final String sort) {
        Collections.sort(list, new Comparator() {
            public int compare(Object a, Object b) {
                int ret = 0;
                try {
                    Method m = a.getClass().getMethod(method, null);
                    m.setAccessible(true);
                    Class<?> type = m.getReturnType();
                    if (type == int.class) {
                        ret = ((Integer) m.invoke(a, null))
                            .compareTo((Integer) m.invoke(b, null));
                    } else if (type == double.class) {
                        ret = ((Double) m.invoke(a, null)).compareTo((Double) m
                            .invoke(b, null));
                    } else if (type == long.class) {
                        ret = ((Long) m.invoke(a, null)).compareTo((Long) m
                            .invoke(b, null));
                    } else if (type == float.class) {
                        ret = ((Float) m.invoke(a, null)).compareTo((Float) m
                            .invoke(b, null));
                    } else if (type == Date.class) {
                        ret = ((Date) m.invoke(a, null)).compareTo((Date) m
                            .invoke(b, null));
                    } else if (isImplementsOf(type, Comparable.class)) {
                        ret = ((Comparable) m.invoke(a, null))
                            .compareTo(m.invoke(b, null));
                    } else {
                        ret = String.valueOf(m.invoke(a, null)).compareTo(
                            String.valueOf(m.invoke(b, null)));
                    }

                    if (isImplementsOf(type, Comparable.class)) {
                        ret = ((Comparable) m.invoke(a, null))
                            .compareTo(m.invoke(b, null));
                    } else {
                        ret = String.valueOf(m.invoke(a, null)).compareTo(
                            String.valueOf(m.invoke(b, null)));
                    }

                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ne) {
                    ne.printStackTrace();
                }

                if (sort != null && sort.toLowerCase().equals(DESC)) {
                    return -ret;
                } else {
                    return ret;
                }
            }
        });
        return list;
    }

    @SuppressWarnings("unchecked")
    public static List<?> sortByMethod(List<?> list, final String methods[],
        final String sorts[]) {
        if (methods != null && methods.length > 0) {
            for (int i = methods.length - 1; i >= 0; i--) {
                final String method = methods[i];
                String tmpSort = ASC;
                if (sorts != null && sorts.length > i && sorts[i] != null) {
                    tmpSort = sorts[i];
                }
                final String sort = tmpSort;
                Collections.sort(list, new Comparator() {
                    public int compare(Object a, Object b) {
                        int ret = 0;
                        try {
                            Method m = a.getClass().getMethod(method, null);
                            m.setAccessible(true);
                            Class<?> type = m.getReturnType();
                            if (type == int.class) {
                                ret = ((Integer) m.invoke(a, null))
                                    .compareTo((Integer) m.invoke(b, null));
                            } else if (type == double.class) {
                                ret = ((Double) m.invoke(a, null))
                                    .compareTo((Double) m.invoke(b, null));
                            } else if (type == long.class) {
                                ret = ((Long) m.invoke(a, null))
                                    .compareTo((Long) m.invoke(b, null));
                            } else if (type == float.class) {
                                ret = ((Float) m.invoke(a, null))
                                    .compareTo((Float) m.invoke(b, null));
                            } else if (type == Date.class) {
                                ret = ((Date) m.invoke(a, null))
                                    .compareTo((Date) m.invoke(b, null));
                            } else if (isImplementsOf(type, Comparable.class)) {
                                ret = ((Comparable) m.invoke(a, null))
                                    .compareTo(m.invoke(b,
                                        null));
                            } else {
                                ret = String.valueOf(m.invoke(a, null))
                                    .compareTo(
                                        String.valueOf(m
                                            .invoke(b, null)));
                            }

                        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ne) {
                            ne.printStackTrace();
                        }

                        if (sort != null && sort.toLowerCase().equals(DESC)) {
                            return -ret;
                        } else {
                            return ret;
                        }
                    }
                });
            }
        }
        return list;
    }

    /**
     * 判断对象实现的所有接口中是否包含szInterface
     *
     * @param clazz
     * @param szInterface
     */
    public static boolean isImplementsOf(Class<?> clazz, Class<?> szInterface) {
        boolean flag = false;

        Class<?>[] face = clazz.getInterfaces();
        for (Class<?> c : face) {
            if (c == szInterface) {
                flag = true;
            } else {
                flag = isImplementsOf(c, szInterface);
            }
        }

        if (!flag && null != clazz.getSuperclass()) {
            return isImplementsOf(clazz.getSuperclass(), szInterface);
        }
        return flag;
    }
}
