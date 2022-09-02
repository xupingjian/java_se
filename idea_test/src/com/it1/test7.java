package com.it1;

public class test7 {
    public static void main(String[] args) {
        Date d1=new Date();
        d1.detail();
    }

}
class Date{
    private  int year;
    private int month;
    private int day;
    public  Date(){
        this(1970,1,1);
        /*新语法：通过“当前”的构造方法去调用另一个本类的构造方法用this(实际参数列表)，this（）调用必须出现第一行*/
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void detail(){
        System.out.println(this.year+"年"+month+"月"+day+"日");
    }
}