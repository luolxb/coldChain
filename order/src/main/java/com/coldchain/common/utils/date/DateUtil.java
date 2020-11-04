package com.coldchain.common.utils.date;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * 日期处理
 * 修改时间：2019年12月18日
 */
public class DateUtil {

    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /**
     * 无分隔符日期格式 "yyyyMMddHHmmssSSS"
     */
    public static String DATE_TIME_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyyMMddHHmmss";
    /**
     * 无分隔符日期格式 "yyyyMMddHHmmssSSS"
     */
    public static String DATE_TIME_PATTERN_YYYY_MM_DD_HH_MM_SS_SSS = "yyyyMMddHHmmssSSS";

    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss 'GMT')
     */
    public final static String DATE_TIME_PATTERN_GMT = "yyyy-MM-dd HH:mm:ss 'GMT'";

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date 日期
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    /**
     * 日期格式化 日期格式为：yyyy-MM-dd
     *
     * @param date    日期
     * @param pattern 格式，如：DateUtil.DATE_TIME_PATTERN
     * @return 返回yyyy-MM-dd格式日期
     */
    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    /**
     * 字符串转换成日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期的格式，如：DateUtil.DATE_TIME_PATTERN
     */
    public static Date stringToDate(String strDate, String pattern) {
        if (StringUtils.isBlank(strDate)) {
            return null;
        }

        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return fmt.parseLocalDateTime(strDate).toDate();
    }

    /**
     * 字符串转换成日期
     *
     * @param strDate 日期字符串
     * @param pattern 日期的格式，如：DateUtil.DATE_TIME_PATTERN
     * @param locale  时区
     */
    public static Date stringToDate(String strDate, String pattern, Locale locale) {
        if (StringUtils.isBlank(strDate)) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale);
        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据周数，获取开始日期、结束日期
     *
     * @param week 周期  0本周，-1上周，-2上上周，1下周，2下下周
     * @return 返回date[0]开始日期、date[1]结束日期
     */
    public static Date[] getWeekStartAndEnd(int week) {
        DateTime dateTime = new DateTime();
        LocalDate date = new LocalDate(dateTime.plusWeeks(week));

        date = date.dayOfWeek().withMinimumValue();
        Date beginDate = date.toDate();
        Date endDate = date.plusDays(6).toDate();
        return new Date[]{beginDate, endDate};
    }

    /**
     * 对日期的【秒】进行加/减
     *
     * @param date    日期
     * @param seconds 秒数，负数为减
     * @return 加/减几秒后的日期
     */
    public static Date addDateSeconds(Date date, int seconds) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusSeconds(seconds).toDate();
    }

    /**
     * 对日期的【分钟】进行加/减
     *
     * @param date    日期
     * @param minutes 分钟数，负数为减
     * @return 加/减几分钟后的日期
     */
    public static Date addDateMinutes(Date date, int minutes) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMinutes(minutes).toDate();
    }

    /**
     * 对日期的【小时】进行加/减
     *
     * @param date  日期
     * @param hours 小时数，负数为减
     * @return 加/减几小时后的日期
     */
    public static Date addDateHours(Date date, int hours) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusHours(hours).toDate();
    }

    /**
     * 对日期的【天】进行加/减
     *
     * @param date 日期
     * @param days 天数，负数为减
     * @return 加/减几天后的日期
     */
    public static Date addDateDays(Date date, int days) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusDays(days).toDate();
    }

    /**
     * 对日期的【周】进行加/减
     *
     * @param date  日期
     * @param weeks 周数，负数为减
     * @return 加/减几周后的日期
     */
    public static Date addDateWeeks(Date date, int weeks) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusWeeks(weeks).toDate();
    }

    /**
     * 对日期的【月】进行加/减
     *
     * @param date   日期
     * @param months 月数，负数为减
     * @return 加/减几月后的日期
     */
    public static Date addDateMonths(Date date, int months) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusMonths(months).toDate();
    }

    /**
     * 对日期的【年】进行加/减
     *
     * @param date  日期
     * @param years 年数，负数为减
     * @return 加/减几年后的日期
     */
    public static Date addDateYears(Date date, int years) {
        DateTime dateTime = new DateTime(date);
        return dateTime.plusYears(years).toDate();
    }

    // ===============================================
    // 时区时间转换
    // ===============================================

    /**
     * 将本地时间, 转换成目标时区的时间
     *
     * @param sourceDate
     * @param targetZoneId {@link ZoneIds}
     * @return
     */
    public static Date convertTimezone(Date sourceDate, String targetZoneId) {
        return convertTimezone(sourceDate, TimeZone.getTimeZone(targetZoneId));
    }

    /**
     * 将指定时区时间，转换成目标时区的时间
     *
     * @param sourceDate   源日期时间
     * @param sourceZoneId 源时区
     * @param targetZoneId 指定时区
     * @return
     */
    public static Date convertTimezone(Date sourceDate, String sourceZoneId, String targetZoneId) {
        TimeZone sourceTimeZone = TimeZone.getTimeZone(sourceZoneId);
        TimeZone targetTimeZone = TimeZone.getTimeZone(targetZoneId);

        return convertTimezone(sourceDate, sourceTimeZone, targetTimeZone);
    }

    /**
     * 将本地时间,转换成对应时区的时间
     *
     * @param localDate
     * @param targetTimezone 转换成目标时区所在的时间
     * @return
     */
    public static Date convertTimezone(Date localDate, TimeZone targetTimezone) {
        return convertTimezone(localDate, TimeZone.getDefault(), targetTimezone);
    }

    /**
     * 将sourceDate转换成指定时区的时间
     *
     * @param sourceDate
     * @param sourceTimezone sourceDate所在的时区
     * @param targetTimezone 转化成目标时间所在的时区
     * @return
     */
    public static Date convertTimezone(Date sourceDate, TimeZone sourceTimezone, TimeZone targetTimezone) {

        // targetDate - sourceDate=targetTimezone-sourceTimezone
        // --->
        // targetDate=sourceDate + (targetTimezone-sourceTimezone)

        Calendar calendar = Calendar.getInstance();
        long sourceTime = sourceDate.getTime(); // date.getTime() 为时间戳, 为格林尼治到系统现在的时间差

        calendar.setTimeZone(sourceTimezone);
        calendar.setTimeInMillis(sourceTime);// 设置之后,calendar会计算各种filed对应的值,并保存

        //获取源时区的到UTC的时区差
        int sourceZoneOffset = calendar.get(Calendar.ZONE_OFFSET);

        calendar.setTimeZone(targetTimezone);
        calendar.setTimeInMillis(sourceTime);

        int targetZoneOffset = calendar.get(Calendar.ZONE_OFFSET);
        int targetDaylightOffset = calendar.get(Calendar.DST_OFFSET); // 夏令时

        long targetTime = sourceTime + (targetZoneOffset + targetDaylightOffset) - sourceZoneOffset;

        return new Date(targetTime);
    }

    /**
     * 判断是否是相应日期的日期格式
     *
     * @param strDate 日期字符串
     * @param pattern 格式，如：DateUtil.DATE_TIME_PATTERN
     * @return 结果
     */
    public static boolean isDateFormat(String strDate, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            sdf.parse(strDate);
            return true;
        } catch (ParseException e) {
        }
        return false;
    }

    /**
     * 获取utc国际时间
     *
     * @return 时间
     */
    public static String getUTCTime() {
        Date now_date = new Date();
        Date utc_date = DateUtil.convertTimezone(now_date, ZoneIds.UTC);
        return DateUtil.format(utc_date, "yyyyMMddHH0000");
    }

    public static void main(String[] args) {
        String dateStr = "2020-03-16 05:43:56 GMT";
        boolean is = DateUtil.isDateFormat(dateStr, DateUtil.DATE_TIME_PATTERN_GMT);
        System.out.println(is);
        Date date = DateUtil.stringToDate(dateStr, DateUtil.DATE_TIME_PATTERN_GMT);
        String datestr = DateUtil.format(date,DateUtil.DATE_PATTERN);
        System.out.println(datestr);
    }
}
