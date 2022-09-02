package com.it314am;

import java.util.Locale;

public class printerDemo {
    public static void main(String[] args) {
         usePrinter((String s)->{
             System.out.println(s.toUpperCase());
         });
         //引用对象的实例方法，lambda表达式被对象的实例方法替代的时候，
        // 它的形式参数全部传递给该方法作为参数
        PrintString ps = new PrintString();
        usePrinter(ps::pritnUpper);

    }
    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");

    }
}
