package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();//s1表示当前值，s2表示下一个添加的值对比学生类的this与s
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);
        //  按照年龄从小到大排序，年龄相同时，按名字字母顺序排序
        Student s5 = new Student("lingqinxia", 33);
        Student s6 = new Student("lingqinxia", 33);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}