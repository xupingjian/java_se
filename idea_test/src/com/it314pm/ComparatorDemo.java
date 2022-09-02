package com.it314pm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*定义一个类(ComparatorDemo),在类中提供两个方法
* 一个方法是：Comparator<String> getComparator() 方法返回值Comparator是一个函数式接口
* 一个方法是主方法，在主方法中调用getComparator方法*/
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("ccccc");
        array.add("aa");
        array.add("b");
        array.add("dddd");
        System.out.println("排序前" + array);
//        Collections.sort(array);//按照自然排序
        Collections.sort(array,getComparator());//按长度排序
        System.out.println("排序后" + array);
    }

    private static Comparator<String> getComparator() {
        //匿名内部类的方式实现
/*        Comparator<String> comp = new Comparator<>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.length()-s2.length();
            }
        };
        return comp;
    }*/
/*        return new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/
        //用lambda表达式替代
        return (String s1,String s2)->{
            return s1.length()-s2.length();
        };
    }
}
