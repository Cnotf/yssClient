package util;

import java.text.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 15:59 2019/07/09
 */
public class CommonUtils {

    /**
     * 取任意一天日期
     * @param date
     * @param type
     * @param num
     * @return
     */
    public static Date getAnyDayDate(Date date, int type, int num) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(type, num);
        return startDT.getTime();
    }


    /**
     * date 日期转字符串
     * @param dateType
     * @param date
     * @return
     */
    public static String dateToString(String dateType, Date date){
        SimpleDateFormat sd = new SimpleDateFormat(dateType);
        return sd.format(date);
    }

    /**
     * 字符串转日期
     * @param dateType
     * @param time
     * @return
     */
    public static Date stringToDate(String dateType, String time) {
        DateFormat format = new SimpleDateFormat(dateType);
        Date date = null;
        try {
            date = format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
