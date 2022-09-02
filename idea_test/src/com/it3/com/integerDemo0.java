package com.it3.com;

/*装箱：把基本数据类型转换为对应的包装类类型
 * 拆箱：把包装类类型转换为对应的基本数据类型*/
public class integerDemo0 {
    public static void main(String[] args) {
//        装箱
        Integer i = Integer.valueOf(100);
//        自动装箱
        Integer ii = 100;
//        拆箱ii.intvalue
        ii = ii.intValue()+200;
        System.out.println(ii);
    }
}
