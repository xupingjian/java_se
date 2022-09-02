package com.it315pm;
//Strea流的收集操作
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林心如");
        list.add("张曼玉");
        list.add("林青霞");
        list.add("柳岩");
/*        //得到名字为3个字的流
        Stream<String> liststream = list.stream().filter(s -> s.length() == 3);

        //把使用Stream流操作完毕的数据收集到list集合中并遍历,若收集到Set集合用Collectors.toSet()
        List<String> names = liststream.collect(Collectors.toList());
        for(String str:names){
            System.out.println(str);
        }*/
        
        //定义一个字符串数组，每个字符串数据由姓名和年龄数据组合而成
        String[] strArray ={"林青霞,30","张曼玉,35","王祖贤,33","柳岩,25"};
        //得到字符串中年龄数据大于28的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s->Integer.parseInt(s.split(",")[1])>28);
        //把使用Stream流操作完毕的数据收集到Map集合中遍历，字符串中的姓名为键，年龄为值
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }

    }
}
