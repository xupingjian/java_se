package com.it25;

import java.nio.charset.StandardCharsets;

public class test08 {
    public static void main(String[] args) {
        //将字符串转换为byte数组
        byte[] bytes = "abcdeW".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }
}
