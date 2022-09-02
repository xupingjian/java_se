package com.set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student s) {
//        return 0;返回值为0表示后面添加的与前面的相等,就不添加

//        return 1;返回值正数则表示当前的数比下一个存储的数大（升序排序）,负值相反。
        int num = this.age - s.age;//this表示当前值，s表示下一个添加的值
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}
