package schedule;

import util.PropertiesUtil;

import java.util.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 20:39 2019/07/04
 */
public class TimerManager {

    //时间间隔:24h
    private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;
    public TimerManager() {
        Calendar calendar = Calendar.getInstance();

        PropertiesUtil propertiesUtil = new PropertiesUtil("properties/crontab.properties");
        String hours = propertiesUtil.readProperty("hours");
        String minuts = propertiesUtil.readProperty("minuts");
        String seconds = propertiesUtil.readProperty("seconds");
        //定制每日执行的时间点
        calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(hours));
        calendar.set(Calendar.MINUTE, Integer.valueOf(minuts));
        calendar.set(Calendar.SECOND, Integer.valueOf(seconds));

        Date date = calendar.getTime();     //第一次执行定时任务的时间
        //如果当前时间已经过去所定时的时间点，则在第二天时间点开始执行
        if (date.before(new Date())) {
            date = this.addDay(date, Calendar.DAY_OF_MONTH, 1);
        }
        Timer timer = new Timer();
        TimerTaskService task = new TimerTaskService();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。
            timer.schedule(task, date, PERIOD_DAY);
//            date = this.addDay(date, Calendar.MILLISECOND, 10);
//        timer.schedule(task, date, PERIOD_DAY);
    }

    // 增加或减少天数
    private Date addDay(Date date, int type, int num) {
        Calendar startDT = Calendar.getInstance();
        startDT.setTime(date);
        startDT.add(type, num);
        return startDT.getTime();
    }
}
