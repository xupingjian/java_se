package com.it1;

public class test6 {
    public static void main(String[] args) {
        Husband jack = new Husband("11111", "jack", "1010",null);
        Wife rose = new Wife("22222", "rose", "1210",null);
        jack.wife = rose;
        rose.husband = jack;
        System.out.println(jack.wife.name);
    }
}
class Husband{
    String id;
    String name;
    String date;
    Wife wife;

    public Husband() {
    }
    //在实例方法中，或者构造方法中，为了区分局部变量和实力变量，这种情况下，this是不能省略的
    public Husband(String id, String name, String date, Wife wife) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.wife = wife;
    }
}
class Wife{
    String id;
    String name;
    String date;
    Husband husband;

    public Wife() {
    }

    public Wife(String id, String name, String date, Husband husband) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.husband = husband;
    }
}
