package com.it27em;
/*使用定时器指定定时任务*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true);这种是守护线程方式

        //指定定时任务
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-06-05 16:05:00");
        timer.schedule(new LogTimerTask(),firstTime,1000*5);
    }
}
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime+"成功备份了一次数据");
    }
}

