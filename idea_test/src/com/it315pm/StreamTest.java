package com.it315pm;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manlist = new ArrayList<>();
        manlist.add("周润发");
        manlist.add("成龙");
        manlist.add("刘德华");
        manlist.add("周星驰");
        manlist.add("李连杰");

        ArrayList<String> womenlist = new ArrayList<>();
        womenlist.add("林心如");
        womenlist.add("张曼玉");
        womenlist.add("林青霞");
        womenlist.add("柳岩");
        womenlist.add("林志玲");
        Stream<String> manstream = manlist.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> womanStream = womenlist.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream<String> stringStream = Stream.concat(manstream, womanStream);
        //把操作后的元素作为构造方法的参数创建演员对象，遍历数据
//        stringStream.map(Actor::new).forEach(System.out::println);
        stringStream.map(Actor::new).forEach(h-> System.out.println(h.getName()));
    }

}
