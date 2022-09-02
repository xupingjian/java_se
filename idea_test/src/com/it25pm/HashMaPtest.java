package com.it25pm;

import java.util.HashSet;
import java.util.Set;

public class HashMaPtest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");
        //重写equals方法之前是false
//        System.out.println(s1.equals(s2));//没重写equals之前调用的是object的equals方法，==比较的是内存地址

//        重写equlas方法之后为true
        System.out.println(s1.equals(s2));

        System.out.println("S1的hashCoede="+ s1.hashCode());//S1的hashCoede=1566723494（重写hashCode()方法之后S1的hashCoede=-1432604525）
        System.out.println("S2的hashCoede="+ s2.hashCode());//S2的hashCoede=331844619（重写hashCode()方法之后S1的hashCoede=-1432604525）

        //s1.equals方法返回true,表示两者相同，只能放进Hashset中一个（不可重复）

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//按道理应该是1，结果两个都放进去了（因为只重写了equals，没有重写hashcode()方法），
        // 向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法，所以

    }
}
