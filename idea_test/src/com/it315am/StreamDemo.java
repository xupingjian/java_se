package com.it315am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;

/*Strream流的常见生成方式
*   1.Colletion体系的集合可以使用默认方法Stream()生成流
*       default Stream<E> stream()
* 2:Map体系的集合间接的生成流
* 3.数组可以通过Stream接口的静态方法of(T...values)生成流*/
public class StreamDemo {
    public static void main(String[] args) {
        //Colletion体系的集合可以使用默认方法Stream()生成流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        HashSet<String> set = new HashSet<String>();
        Stream<String> setstream = set.stream();

        //Map体系的集合间接的生成流
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();//键对应的流
        Stream<Integer> valueStream = map.values().stream();//值对应的流
        Stream<Map.Entry<String, Integer>> entry = map.entrySet().stream();//键值对对象对应的流

        //数组可以通过Stream接口的静态方法of(T...values)生成流*/
        String[] strArray = {"hello","world","java"};
        Stream<String> strArray1 = Stream.of(strArray);
        Stream<String> stringStream = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);


    }
}
