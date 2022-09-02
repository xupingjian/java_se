package com.it22;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(2008,8,8);
        MyTime t2 = new MyTime(2008, 8, 8);
        System.out.println(t1.equals(t2));//默认继承object类的equals是利用双等于判断（只能判断两个对象保存的内存地址），需要重写。


    }
}
class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year && month == myTime.month && day == myTime.day;
    }


}