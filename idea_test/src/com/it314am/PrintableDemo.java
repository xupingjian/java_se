package com.it314am;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable(i -> System.out.println(i));
        //方法引用改进lambda方法
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p){
        p.printInt(666);
    }
}
