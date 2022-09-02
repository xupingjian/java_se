package com.it25pm;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetdemo1 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<wuGui> wuGuis = new TreeSet<>();这样不行，没有通过构造方法传递一个比较器进去
        //给构造方法传递一个比较器
        TreeSet<wuGuis> guis = new TreeSet<>(new wuGuiscomparator());
        guis.add(new wuGuis(15));
        guis.add(new wuGuis(35));
        guis.add(new wuGuis(23));
        for (wuGuis w:guis
             ) {
            System.out.println(w);
        }
    }
}
class wuGuis {
    private int age;

    public wuGuis() {
    }

    public wuGuis(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "wuGuis{" +
                "age=" + age +
                '}';
    }

}
//单独写一个乌龟比较器,比较器实现java.util.Comparator接口(Comparable是Java.lang包下的，Comparator是java.util包下的)
class wuGuiscomparator implements Comparator<wuGuis>{

    @Override
    public int compare(wuGuis o1, wuGuis o2) {
        return o1.getAge()-o2.getAge();
    }
}