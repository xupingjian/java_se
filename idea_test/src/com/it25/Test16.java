package com.it25;

public class Test16 {
    public static void main(String[] args) {
        Integer i = new Integer(123);//基本数据类型--》引用数据类型(装箱)
        float f = i.floatValue();//引用数据类型-->基本数据类型(拆箱)
        System.out.println(f);

        Integer wer = new Integer("12");//将String类型的数字转换成Interger包装类型
        System.out.println(wer);
        Integer integer = new Integer(12);
        String s = Integer.toBinaryString(12);
        System.out.println(s);
        String s1 = String.valueOf(wer);
        System.out.println(s1);


    }
}
