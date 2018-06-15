package com.trycatch.custom.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
    private static SimpleDateFormat sdf;
    private static String PATTERN="yyyyMMdd";

    public static Date stringToDate(String str, String pattern){
        sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static Date stringToDate(String str){
        sdf = new SimpleDateFormat(PATTERN);
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static String dateToString(Date date,String pattern){
        sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    public static String dateToString(Date date){
        String pattern = "yyyy-MM-dd";
        sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.format(date);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 得到UTC时间，类型为字符串，格式为"yyyy-MM-dd HH:mm"
     * 如果获取失败，返回null
     *
     * @return
     */
    private static String getUTCTimeStr(String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);

        StringBuffer UTCTimeBuffer = new StringBuffer();
        // 1、取得本地时间：
        Calendar cal = Calendar.getInstance();
        // 2、取得时间偏移量：
        int zoneOffset = cal.get(Calendar.ZONE_OFFSET);
        // 3、取得夏令时差：
        int dstOffset = cal.get(Calendar.DST_OFFSET);
        // 4、从本地时间里扣除这些差量，即可以取得UTC时间：
        cal.add(Calendar.MILLISECOND, -(zoneOffset + dstOffset));
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        UTCTimeBuffer.append(year).append("-").append(month).append("-").append(day);
        UTCTimeBuffer.append(" ").append(hour).append(":").append(minute).append(":").append(second );
        try {
            format.parse(UTCTimeBuffer.toString());
            return UTCTimeBuffer.toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 将UTC时间转换为东八区时间
     * @return
     */
    public static String getLocalTimeFromUTC(String pattern){
        Date UTCDate;
        SimpleDateFormat format = new SimpleDateFormat(pattern);

        String localTimeStr = null ;
        try {
            UTCDate = format.parse(getUTCTimeStr(pattern));
            format.setTimeZone(TimeZone.getTimeZone("GMT-8")) ;
            localTimeStr = format.format(UTCDate) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return localTimeStr ;
    }

    public static String getLocalTimeFromUTC(){
        return getLocalTimeFromUTC("yyyy-MM-dd HH:mm:ss") ;
    }

    public static Date add(Date date,int field,int amount){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(field,amount);
        return calendar.getTime();
    }

}