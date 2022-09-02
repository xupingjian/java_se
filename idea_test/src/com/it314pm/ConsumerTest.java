package com.it314pm;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] strArray = {"名抢下,30","张鳗鱼,35","王祖贤,59"};
        printInfo(strArray,(String str)->{
            String name = str.split(",")[0];
            System.out.print("姓名："+name);
        },(String str)->{
            int age = Integer.parseInt(str.split(",")[1]);
            System.out.println(",年龄"+age);
        });
    }
    private static void printInfo(String[] strArray, Consumer<String> con1,Consumer<String> con2){
        for(String str:strArray){
            con1.andThen(con2).accept(str);
        }
    }
}
