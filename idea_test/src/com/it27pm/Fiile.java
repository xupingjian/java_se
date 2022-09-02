package com.it27pm;
/*
* 一个汉字存储：
* 如果是GBK编码，占用2个字节
* 如果是Utf-8编码，占用三个字节*/

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Fiile {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        //编码
        //byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节，将该结果存储到新的字节数组中
        byte[] bys =s.getBytes();//[-28, -72, -83, -27, -101, -67] utf-8
        //byte[] getBytes(String charsetName):使用指定的字符集将该String 编码为一系列字节，将结果存储到新的字节数组中
//        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67] utf-8
//        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6],编码过程把一个字符串变成一个字节数组
        System.out.println(Arrays.toString(bys));
        //解码
        //String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
//        String ss = new String(bys);
        //String(byte[] bytes,String charsetName):通过指定的字符集解码指定的字节数组来构造新的String
        String ss = new String(bys,"UTF-8");
        System.out.println(ss);
    }

}
