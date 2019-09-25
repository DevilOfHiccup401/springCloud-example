package cn.sml.configclient;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class test {

    public static void main(String[] args) {
        /*LocalDate localDate  = LocalDate.now();
        int year = localDate.getYear();
        int year1 = localDate.get(ChronoField.YEAR);
        Month month = localDate.getMonth();
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
        int day = localDate.getDayOfMonth();
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println("年份对比：year="+year+"----------"+"year1="+year1);
        System.out.println("年份对比：month="+month+"----------"+"month1="+month1);
        System.out.println("年份对比：day="+day+"------------"+"day="+day);
        System.out.println("年份对比：dayOfWeek="+dayOfWeek+"---------------"+"dayOfWeek1="+dayOfWeek1);
*/
       /* Hashtable<String, Date> hashtable  =new Hashtable<>();
        HashMap<String ,Date> hashMap = new HashMap<>();
        ConcurrentHashMap<String,Date> concurrentHashMap = new ConcurrentHashMap<>();
        Collections.synchronizedMap(hashMap);*/

       Integer a = 5;
       Integer b = 5;
       Integer c = new Integer("5");
       Integer d = new Integer("128");
       int e = 128;
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(c==d);
        System.out.println(a==e);
        System.out.println(d==e);
    }
}
