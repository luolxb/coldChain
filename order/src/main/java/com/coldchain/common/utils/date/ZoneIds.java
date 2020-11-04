package com.coldchain.common.utils.date;

import java.util.TimeZone;

/**
 * java.time.ZoneId#SHORT_IDS
 */
public class ZoneIds {

    /*
    EST - -05:00
    HST - -10:00
    MST - -07:00
    ACT - Australia/Darwin
    AET - Australia/Sydney
    AGT - America/Argentina/Buenos_Aires
    ART - Africa/Cairo
    AST - America/Anchorage
    BET - America/Sao_Paulo
    BST - Asia/Dhaka
    CAT - Africa/Harare
    CNT - America/St_Johns
    CST - America/Chicago
    CTT - Asia/Shanghai
    EAT - Africa/Addis_Ababa
    ECT - Europe/Paris
    IET - America/Indiana/Indianapolis
    IST - Asia/Kolkata
    JST - Asia/Tokyo
    MIT - Pacific/Apia
    NET - Asia/Yerevan
    NST - Pacific/Auckland
    PLT - Asia/Karachi
    PNT - America/Phoenix
    PRT - America/Puerto_Rico
    PST - America/Los_Angeles
    SST - Pacific/Guadalcanal
    VST - Asia/Ho_Chi_Min
    */

    public static final String UTC = "Z";// utc国际时间

    public static final String DEFAULT = TimeZone.getDefault().toZoneId().getId();

    public static final String BEIJING = "Asia/Shanghai";  //也可以使用"+8" 北京在东8区

    //    UTC+10 夏莫罗标准时区
    //    UTC-11 美属萨摩亚标准时区
    //    UTC-10HST夏威夷-阿留申标准时区
    //    UTC-9AKST阿拉斯加标准时区
    //    UTC-8PST太平洋标准时区
    //    UTC-7MST山地标准时区
    //    UTC-6CST中部标准时区
    //    UTC-5EST东部标准时区
    //    UTC-4AST大西洋标准时区

    //https://baike.baidu.com/item/%E7%BE%8E%E5%9B%BD%E6%97%B6%E9%97%B4/3163209?fr=aladdin
    /*
    太平洋时区：代表城市洛杉矶，与北京相差16小时；
    山地时区：代表城市盐湖城，与北京相差15小时；
    中部时区：代表城市芝加哥，与北京相差14小时；
    东部时区：代表城市纽约、华盛顿，与北京相差13小时；
    夏威夷时区：代表城市：火奴鲁鲁，与北京相差18小时；
    阿拉斯加时区：代表城市：费尔班克斯，与北京相差17小时。
    */

    public static final String US_EST = "-5";  //东部标准时区
    public static final String US_CST = "-6";// 中部标准时区
    public static final String US_MST = "-7";// 山地标准时区
    public static final String US_PST = "America/Los_Angeles";  //也可以使用"-8" 太平洋标准时区

    public static final String JST = "Asia/Tokyo";//日本东京
}
