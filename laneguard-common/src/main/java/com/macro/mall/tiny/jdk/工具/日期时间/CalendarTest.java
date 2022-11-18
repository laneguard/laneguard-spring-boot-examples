package com.macro.mall.tiny.jdk.工具.日期时间;

import java.util.Calendar;

/**
 * @ClassName CalendarTest
 * @Author WB-918966
 * @Date 2022/11/2 17:04
 * @Version 1.0
 *
 * 这个类还提供了额外的字段和实施具体的日历系统外面包的方法。
 *
 * 日历定义了某些日历字段返回值的范围。
 *
 * public abstract class Calendar
 *    extends Object
 *       implements Serializable, Cloneable, Comparable<Calendar>
 **/
public abstract class CalendarTest {
    /**
     *字段
     * static int ALL_STYLES -- 这个风格说明符getDisplayNames指示所有样式的名称，如"January" 和"Jan"。
     *
     * static int AM -- 这是AM_PM字段指示当天的期限从半夜到中午前的值。
     *
     * static int AM_PM -- 这个字段数get和set的指示HOUR是中午之前或之后。
     *
     * static int APRIL -- 这个MONTH字段表示第四个月当年在格里高利历和罗马儒略历中的值。
     *
     * protected boolean areFieldsSet -- 为true，如果fields[] 与当前设置的时间同步。
     *
     * static int AUGUST -- 这是一个MONTH字段指示第八个年度在格里高利历和罗马儒略历中的值。
     *
     * static int DATE -- 这是字段数为get 和 set，表示该月的日期。
     *
     * static int DAY_OF_MONTH -- 这是字段数为get 和 set，表示该月的日期。
     *
     * static int DAY_OF_WEEK -- 这是字段数get和set表示星期几。
     *
     * static int DAY_OF_WEEK_IN_MONTH -- 这是字段数为get和set，指示当前月中的序数星期。
     *
     * static int DAY_OF_YEAR -- 这是字段数为get和set，表示本年度内天数。
     *
     * static int DECEMBER -- 这是一个MONTH字段指示腊月当年在格里高利历和罗马儒略历中的值。
     *
     * static int DST_OFFSET -- 这是字段数get和set的指示夏令时以毫秒为单位的偏移。
     *
     * static int ERA -- 这是字段数为get和set显示的时代，例如，在儒略历中的AD或BC。
     *
     * static int FEBRUARY -- 这是一个MONTH字段指示第二个年度在格里高利历和罗马儒略历中的值。
     *
     * static int FIELD_COUNT -- 这是通过获取确认和设置不同的字段的数量。
     *
     * protected int[] fields -- 这是当前设置的时间为这个日历的日历字段值。
     *
     * static int FRIDAY -- 这是DAY_OF_WEEK字段的说明周五的值。
     *
     * static int HOUR -- 这是字段数为get和set，表示上午或下午的时间。
     *
     * static int HOUR_OF_DAY -- 这是字段数get和set表示一天中的小时。
     *
     * protected boolean[] isSet -- 这是判断该日历某一指定日历字段设置该标志。
     *
     * protected boolean isTimeSet -- 这是true如果当时的时间值是有效的。
     *
     * static int JANUARY -- 这是一个MONTH字段表示第一个月，一年的公历和罗马儒略历中的值。
     *
     * static int JULY -- 这是一个MONTH字段表示第七个月当年在格里高利历和罗马儒略历中的值。
     *
     * static int JUNE -- 这是一个MONTH字段表明了第六个月，一年的公历和罗马儒略历中的值。
     *
     * static int LONG -- 这是风格说明符getDisplayName和getDisplayNames表示长的名字，如“January”。
     *
     * static int MARCH -- 这是一个MONTH字段指示第三个年度在格里高利历和罗马儒略历中的值。
     *
     * static int MAY -- 这是一个MONTH字段表示第五个月当年在格里高利历和罗马儒略历中的值。
     *
     * static int MILLISECOND -- 这是字段数 get 和 set 指示第二内毫秒。
     *
     * static int MINUTE -- 这是字段数 get 和 set 指示一小时中的分钟。
     *
     * static int MONDAY -- 这是DAY_OF_WEEK字段的说明周一的值。
     *
     * static int MONTH -- 这是字段数为get 和 set，指示一个月。
     *
     * static int NOVEMBER -- 这是一个MONTH字段指示第十一个月当年在格里高利历和罗马儒略历中的值。
     *
     * static int OCTOBER -- 这是一个MONTH字段指示第十一个月，一年中的格里高利历和罗马儒略历中的值。
     *
     * static int PM -- 这是AM_PM字段中的指示当天的期限从中午到午夜前的值。
     *
     * static int SATURDAY -- 这是DAY_OF_WEEK字段的指示周六的值。
     *
     * static int SECOND -- 这是字段数get和set指示一分钟中的秒。
     *
     * static int SEPTEMBER -- 这是一个MONTH字段表示第九个月当年在格里高利历和罗马儒略历中的值。
     *
     * static int SHORT -- 这是风格说明符getDisplayName和getDisplayNames显示一个简短的名称，如"Jan"。
     *
     * static int SUNDAY -- 这是DAY_OF_WEEK字段的说明周日的值。
     *
     * static int THURSDAY -- 这是DAY_OF_WEEK字段的说明周四的值。
     *
     * protected long time -- 这是当前设置的时间，这个日历，以毫秒表示1970年1月1日，0:00:00 GMT之后。
     *
     * static int TUESDAY -- 这是DAY_OF_WEEK字段的说明星期二的值。
     *
     * static int UNDECIMBER -- 这是一个MONTH字段指示一年第十三个月的值。
     *
     * static int WEDNESDAY -- 这是DAY_OF_WEEK字段说明周三的值。
     *
     * static int WEEK_OF_MONTH -- 这是字段数为GET和SET，指示当前月中的星期数。
     *
     * static int WEEK_OF_YEAR -- 这是字段数为GET和SET，表示在本年度内的周数。 。
     *
     * static int YEAR -- 这是字段数get和set表示年份。
     *
     * static int ZONE_OFFSET -- 这是字段数为GET和SET指示原与GMT以毫秒为单位的偏移
     */

    /**
     * 构造
     * 1	protected Calendar()
     * 这个构造函数构造一个日历使用默认时区和语言环境。
     * 2	protected Calendar(TimeZone zone, Locale aLocale)
     * 这个构造函数构造一个日历指定的时区和语言环境。
     */

    /**
     * 1	abstract void add(int field, int amount)
     * 此方法添加或减去指定的时间量，以给定日历字段，基于日历的规则。
     * 2	boolean after(Object when)
     * 这个方法返回当前日历是否代表在指定Object表示的时间之后的时间。
     * 3	boolean before(Object when)
     * 这个方法返回当前日历是否代表在指定Object表示的时间之前的时间。
     * 4	void clear()
     * 此方法设置此Calendar的所有日历字段值和时间值（毫秒从历元至偏移量）未定义。
     * 5	void clear(int field)
     * 此方法设置给定日历字段值和本日历不确定的时间值（毫秒从历元至偏移量）。
     * 6	Object clone()
     * 此方法创建并返回此对象的一个副本。
     * 7	int compareTo(Calendar anotherCalendar)
     * 这个方法比较两个Calendar对象表示的时间值（从历元至毫秒偏移量）。
     * 8	protected void complete()
     * 此方法填充在日历字段中所有未设置的字段。
     * 9	protected abstract void computeFields()
     * 这种方法的当前毫秒时间值时间日历fields[]字段值转换。
     * 10	protected abstract void computeTime()
     * 这种方法在fields[]到毫秒的时间值时将转换当前日历字段值。
     * 11	boolean equals(Object obj)
     * 这个方法这个日历比较指定的对象。
     * 12	int get(int field)
     * 此方法返回给定日历字段的值。
     * 13	int getActualMaximum(int field)
     * 此方法返回指定日历字段可能拥有的最大值，鉴于此Calendar时间值。
     * 14	int getActualMinimum(int field)
     * 此方法返回指定日历字段可能拥有的最小值，鉴于此Calendar时间值。
     * 15	static Locale[] getAvailableLocales()
     * 此方法返回所有语言环境，它由此类的getInstance方法可为之返回本地化实例的数组。
     * 16	String getDisplayName(int field, int style, Locale locale)
     * 此方法返回的日历字段值在给定的风格和语言环境的字符串表示形式。
     * 17	Map<String,Integer> getDisplayNames(int field, int style, Locale locale)
     * 这个方法返回一个Map包含日历字段在给定的风格和语言环境和相应的字段值的所有名称。
     * 18	int getFirstDayOfWeek()
     * 这种方法得到一周的第一天是什么;例如，在美国为SUNDAY，在法国为MONDAY。
     * 19	abstract int getGreatestMinimum(int field)
     * 此方法返回此Calendar实例给定日历字段的最高的最小值。
     * 20	static Calendar getInstance()
     * 使用默认时区和语言环境这种方法获得一个日历。
     * 21	static Calendar getInstance(Locale aLocale)
     * 使用默认时区和指定的区域设置此方法获取一个日历。
     * 22	static Calendar getInstance(TimeZone zone)
     * 使用指定的时区和默认语言环境这种方法得到一个日历。
     * 23	static Calendar getInstance(TimeZone zone, Locale aLocale)
     * 这种方法得到一个日历指定的时区和语言环境。
     * 24	abstract int getLeastMaximum(int field)
     * 此方法返回此Calendar实例给定日历字段的最低的最大值。
     * 25	abstract int getMaximum(int field)
     * 此方法返回此Calendar实例给定日历字段的最大值。
     * 26	int getMinimalDaysInFirstWeek()
     * 这种方法得到什么在今年的第一个星期所需的最少天数;例如，如果第一周被定义为一个包含在第一个月的一年的第一天，此方法返回1。
     * 27	abstract int getMinimum(int field)
     * 此方法返回此Calendar实例给定日历字段的最小值。
     * 28	Date getTime()
     * 此方法返回表示此Calendar的时间值（从历元至“毫秒偏移量）的Date对象。
     * 29	long getTimeInMillis()
     * 该方法以毫秒为单位返回此Calendar的时间值。
     * 30	TimeZone getTimeZone()
     * 这种方法获取的时区。
     * 31	int hashCode()
     * 此方法返回此日历的哈希码。
     * 32	protected int internalGet(int field)
     * 此方法返回给定日历字段的值。
     * 33	boolean isLenient()
     * 这个方法告诉日期/时间的解释是否是宽松的。
     * 34	boolean isSet(int field)
     * 此方法可确定给定日历字段的值集，包括案件的值被设置由一个get方法调用触发内部字段计算。
     * 35	abstract void roll(int field, boolean up)
     * 此方法添加或减去（上/下）的时候一个单元在给定的时间字段不更改更大的字段。
     * 36	void roll(int field, int amount)
     * 此方法将指定的（签署）金额至指定日历字段不更改更大的字段。
     * 37	void set(int field, int value)
     * 此方法设置给定日历字段为给定值。
     * 38	void set(int year, int month, int date)
     * 此方法设置为日历字段的值 YEAR, MONTH, and DAY_OF_MONTH..
     * 39	void set(int year, int month, int date, int hourOfDay, int minute)
     * 此方法设置为日历字段的值YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY, 和 MINUTE.
     * 40	void set(int year, int month, int date, int hourOfDay, int minute, int second)
     * 此方法设置的字段的值YEAR, MONTH, DAY_OF_MONTH, HOUR, MINUTE, 和SECOND.
     * 41	void setFirstDayOfWeek(int value)
     * 此方法设置一周的第一天是什么;例如，在美国为SUNDAY，在法国为MONDAY。
     * 42	void setLenient(boolean lenient)
     * 此方法规定日期/时间的解释是否是宽松的。
     * 43	void setMinimalDaysInFirstWeek(int value)
     * 此方法设置在哪一年中第一个星期所需的最少天数;例如，如果在第一周被定义为一个包含在第一个月的一年的第一天，传值调用这个方法。
     * 44	void setTime(Date date)
     * 此方法设置此Calendar时间与给定的日期。
     * 45	void setTimeInMillis(long millis)
     * 这个方法从给定的long值设置此Calendar的当前时间。
     * 46	void setTimeZone(TimeZone value)
     * 此方法使用给定的时区值设置时区。
     * 47	String toString()
     * 此方法返回此日历的字符串表示形式。
     */

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 获取年
        int year = calendar.get(Calendar.YEAR);
        // 获取月，注意月份下标从0开始，所以取月份要+1
        int month = calendar.get(Calendar.MONTH) + 1;
        // 星期，英语国家星期从星期日开始计算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        // 获取时
        int hour = calendar.get(Calendar.HOUR);
        // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
        // 获取分
        int minute = calendar.get(Calendar.MINUTE);
        // 获取秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println("年:"+ year + "\n月：" + month + "\n日：" + day + "\n时：" + hour
            + "\n分：" + minute + "\n秒：" + second +  "\n星期：" + weekday);

        // 或者6个字段分别进行设置，由于月份下标从0开始赋值月份要-1
        // 如果想设置为某个日期，可以一次设置年月日时分秒，由于月份下标从0开始赋值月份要-1
        // calendar.set(year, month, date, hourOfDay, minute, second);
        calendar.set(2019, 4, 28, 9, 58, 53);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 58);
        calendar.set(Calendar.SECOND, 53);
        System.out.println(calendar.getTime());
        // 如果想设置为某个日期，可以一次设置年月日时分秒，由于月份下标从0开始赋值月份要-1
        // cal.set(year, month, date, hourOfDay, minute, second);
        calendar.set(2019, 4, 28, 9, 58, 53);
        System.out.println(calendar.getTime());
        //结果：Tue May 28 09:58:53 CST 2019

        //当晚最后一秒  add 一秒 会自动加一天
        System.out.println(calendar.getTime());
        calendar.set(2019, 4, 28, 23, 59, 59);
        calendar.add(Calendar.SECOND, 1);
        System.out.println(calendar.getTime());
        //当月的最后一天 add 一天
        calendar.set(2019, 4, 30, 8, 0, 0);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        //获取当前时间
        System.out.println("当前时间:"+calendar.getTime());

        //判断是否在某个时间之后
        Calendar time = Calendar.getInstance();
        time.set(2019,3,29,8,0,0);
        System.out.println("自己设定的时间:"+time.getTime());
        //当前时间是否在设定的time之后
        System.out.println(calendar.after(time));
        //当前时间是否在设定的time之前
        System.out.println(calendar.before(time));

    }
}
