package day;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class day {
    //计算你从出生到现在以及过去多少天多小时
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("你的出生年月");
        String str = sc.next();

        SimpleDateFormat s = new SimpleDateFormat("yyyy年mm月dd日");
        Date nowDate = new Date();

        Date oldDate = s.parse(str);
        String old = s.format(oldDate);
        System.out.println("出生日期"+old);

        long birthgay = oldDate.getTime();
        long nowday = nowDate.getTime();
        long time = nowday - birthgay;

        System.out.println("出生到现在为："+time/1000/60/60/24 + "天"+time%1000%60%60+"小时");
    }
}
