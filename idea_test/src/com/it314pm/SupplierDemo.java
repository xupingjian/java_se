package com.it314pm;

//import javax.print.attribute.IntegerSyntax;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> {
            return "哈哈哈";
        });
        System.out.println(s);

        Integer i = getInteger(() -> 20);
        System.out.println(i);
    }

    //定义一个方法，返回一个整数数据，Supplier生产型接口
    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
