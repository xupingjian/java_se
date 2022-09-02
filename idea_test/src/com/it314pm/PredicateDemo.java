package com.it314pm;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", (String s) -> {
            return s.length() > 8;
        });
        System.out.println(b1);
        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b2);
        boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);
        boolean b4 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
/*        boolean b1 = pre1.test(s);
        boolean b2 = pre2.test(s);
        boolean b = b1 && b2;
        return b;*/
        return pre1.and(pre2).test(s);//短路与
//        return pre1.or(pre2).test(s);//或
    }

    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);//正常逻辑
//        return pre.negate().test(s);//非逻辑
    }
}
