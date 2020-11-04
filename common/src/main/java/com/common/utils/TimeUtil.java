package com.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.util.StringUtils;

public final class TimeUtil {
    public static String timestampToStr(Long a) {
        if (StringUtils.isEmpty(a)) {
            return "";
        } else {
            a = a * 1000L;
            Date var1 = new Date(a);
            Date var2 = new Date();
            Date var3 = new Date((new Date()).getTime() - 86400000L);
            SimpleDateFormat var4 = new SimpleDateFormat(WechatUtil.ALLATORIxDEMO("c\tc\t7=W]~\u0014"));
            SimpleDateFormat var5 = new SimpleDateFormat(ALLATORIxDEMO("\u0000_rz%"));
            SimpleDateFormat var10001 = var4;
            SimpleDateFormat var10000 = var4;
            String var8 = var4.format(var1);
            String var6 = var10001.format(var2);
            String var7 = var10000.format(var3);
            if (var8.equals(var6)) {
                return (new StringBuilder()).insert(0, WechatUtil.ALLATORIxDEMO("人夳P")).append(var5.format(var1)).toString();
            } else {
                return var8.equals(var7) ? (new StringBuilder()).insert(0, ALLATORIxDEMO("晠夾h")).append(var5.format(var1)).toString() : (new SimpleDateFormat(WechatUtil.ALLATORIxDEMO("\tc\tc]W=7\u0014~PR8 \u001dwJi\u0003"))).format(new Date(a));
            }
        }
    }

    public static Long transForSecond(String a, String pattern) {
        if (StringUtils.isEmpty(a)) {
            return null;
        } else {
            SimpleDateFormat sf = new SimpleDateFormat(pattern);
            Date var2 = new Date();

            Date var10000;
            try {
                var2 = sf.parse(a);
            } catch (ParseException var3) {
                var10000 = var2;
                var3.printStackTrace();
                return var10000.getTime() / 1000L;
            }

            var10000 = var2;
            return var10000.getTime() / 1000L;
        }
    }

    public static String transForDateStr(Long a, String pattern) {
        String var2 = "";
        if (a != null && a > 0L) {
            SimpleDateFormat sf = new SimpleDateFormat(pattern);

            try {
                var2 = sf.format(a * 1000L);
                return var2;
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        return var2;
    }

    public static String ALLATORIxDEMO(String a) {
        int var10000 = (3 ^ 5) << 4 ^ 1;
        int var10001 = 4 << 4 ^ 4 << 1;
        int var10002 = 2 << 3 ^ 2 ^ 5;
        int var10003 = (a = (String)a).length();
        char[] var10004 = new char[var10003];
        boolean var10006 = true;
        int var5 = var10003 - 1;
        var10003 = var10002;
        int var3;
        var10002 = var3 = var5;
        char[] var1 = var10004;
        int var4 = var10003;
        var10000 = var10002;

        for(int var2 = var10001; var10000 >= 0; var10000 = var3) {
            var10001 = var3;
            char var6 = a.charAt(var3);
            --var3;
            var1[var10001] = (char)(var6 ^ var2);
            if (var3 < 0) {
                break;
            }

            var10002 = var3--;
            var1[var10002] = (char)(a.charAt(var10002) ^ var4);
        }

        return new String(var1);
    }

    public static String timestampToGoodsVisitDateStr(Long a) {
        if (StringUtils.isEmpty(a)) {
            return "";
        } else {
            a = a * 1000L;
            Date var1 = new Date(a);
            Date var2 = new Date();
            Date var3 = new Date((new Date()).getTime() - 86400000L);
            SimpleDateFormat var4 = new SimpleDateFormat(WechatUtil.ALLATORIxDEMO("c\tc\t7=W]~\u0014"));
            SimpleDateFormat var5 = new SimpleDateFormat(ALLATORIxDEMO("\u0000_rz%"));
            SimpleDateFormat var10001 = var4;
            SimpleDateFormat var10000 = var4;
            String var8 = var4.format(var1);
            String var6 = var10001.format(var2);
            String var7 = var10000.format(var3);
            if (var8.equals(var6)) {
                return (new StringBuilder()).insert(0, WechatUtil.ALLATORIxDEMO("人夳P")).append(var5.format(var1)).toString();
            } else {
                return var8.equals(var7) ? (new StringBuilder()).insert(0, ALLATORIxDEMO("晠夾h")).append(var5.format(var1)).toString() : (new SimpleDateFormat(WechatUtil.ALLATORIxDEMO("\tc\tc]W=7\u0014~PR8 \u001dwJi\u0003"))).format(new Date(a));
            }
        }
    }

    public static Long getTimestampForHour() {
        SimpleDateFormat var0 = new SimpleDateFormat(ALLATORIxDEMO("1n1neZ\u0005:,sh_\u0000-x'r'x"));
        String var1 = var0.format(new Date());
        Long var2 = null;

        try {
            var2 = var0.parse(var1).getTime() / 1000L;
            return var2;
        } catch (ParseException var3) {
            var3.printStackTrace();
            return var2;
        }
    }

    public TimeUtil() {
    }
}