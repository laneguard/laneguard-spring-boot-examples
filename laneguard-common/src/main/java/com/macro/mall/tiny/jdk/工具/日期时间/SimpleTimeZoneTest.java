package com.macro.mall.tiny.jdk.工具.日期时间;

/**
 * @ClassName SimpleTimeZoneTest
 * @Author WB-918966
 * @Date 2022/11/4 11:11
 * @Version 1.0
 **/
public class SimpleTimeZoneTest {
    /**
     * java.util.SimpleTimeZone 类是时区的具体子类，它表示与公历使用的时区。以下是有关SimpleTimeZone的 要点：
     *
     * 这个类持有GMT的偏移，称为原始偏移。
     *
     * 这个类还拥有开始和结束的夏令时安排的规则。
     *
     * 类声明
     * 以下是java.util.SimpleTimeZone类的声明：
     *
     * public class SimpleTimeZone
     *    extends TimeZone
     * 字段域
     * 以下是java.util.SimpleTimeZone类中的字段：
     *
     * static int STANDARD_TIME -- 这是不变的开始或结束时间的规定为标准时间的模式。
     *
     * static int UTC_TIME -- 这是不变的开始或结束时间指定为UTC的模式。
     *
     * static int WALL_TIME -- 这是不变的开始或结束时间指定为挂钟时间的模式。
     *
     * 它还包括从类 TimeZone 继承的字段。类构造函数
     * S.N.	构造函数 & 描述
     * 1	SimpleTimeZone(int rawOffset, String ID)
     * 此构造一个SimpleTimeZone与给定基准时区GMT和时区的ID与保存白昼没有时间表偏移。
     * 2	SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime,
     * int endMonth, int endDay, int endDayOfWeek, int endTime)
     * 此构造一个SimpleTimeZone与给定基准时区GMT偏移量，时区ID，以及启动和结束夏令时规则。
     * 3	SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime,
     * int endMonth, int endDay, int endDayOfWeek, int endTime, int dstSavings)
     * 此构造一个SimpleTimeZone与给定基准时区GMT偏移量，时区ID，以及启动和结束夏令时规则。
     * 4	SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime,
     * int startTimeMode, int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int dstSavings)
     * 此构造一个SimpleTimeZone与给定基准时区GMT偏移量，时区ID，以及启动和结束夏令时规则。类方法
     * S.N.	方法 & 描述
     * 1	Object clone()
     * 此方法返回当前的SimpleTimeZone实例的一个副本。
     * 2	boolean equals(Object obj)
     * 此方法比较两个的SimpleTimeZone对象是否相等。
     * 3	int getDSTSavings()
     * 此方法返回以毫秒为单位的时钟是在夏令时提前的时间量。
     * 4	int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis)
     * 此方法返回本地时间与UTC之间以毫秒为单位的差异，同时考虑到原始偏移量和夏令时的效果，对于指定的日期和时间。
     * 5	int getOffset(long date)
     * 此方法返回当前时区从UTC偏移量在给定的时间。
     * 6	int getRawOffset()
     * 此方法获取GMT这个时区偏移量。
     * 7	int hashCode()
     * 此方法生成SimpleDateFormat对象的哈希代码。
     * 8	boolean hasSameRules(TimeZone other)
     * 如果此区域具有相同的规则和偏移量为另一个区域，此方法返回true。
     * 9	boolean inDaylightTime(Date date)
     * 此方法查询，如果给定的日期是在夏令时。
     * 10	void setDSTSavings(int millisSavedDuringDST)
     * 此方法以毫秒为单位的时钟是在夏令时提前设定的时间量。
     * 11	void setEndRule(int endMonth, int endDay, int endTime)
     * 此方法设置夏令时结束规则设置为某个月份的固定日期。
     * 12	void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime)
     * 此方法设置夏令时结束规则。
     * 13	void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime, boolean after)
     * 此方法设置夏令时结束规则到平日在一个月内给定日期之前或之后，如第一个星期一或以后的第8位。
     * 14	void setRawOffset(int offsetMillis)
     * 此方法设置的基准时区偏移为GMT。
     * 15	void setStartRule(int startMonth, int startDay, int startTime)
     * 此方法设置夏令时开始规则设置为某个月份的固定日期。
     * 16	void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime)
     * 此方法设置夏令时开始规则。
     * 17	void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime, boolean after)
     * 此方法之前或之后指定的日期在一个月之内，例如，在第一个星期一或以后的第8位。设置夏令时开始规则工作日
     * 18	void setStartYear(int year)
     * 此方法设置夏令时的开始年份。
     * 19	String toString()
     * 此方法返回当前时区的字符串表示形式。
     * 20	boolean useDaylightTime()
     * 此方法查询，如果此时区使用夏令时。
     */
}
