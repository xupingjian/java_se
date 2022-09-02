package com.it26am.serialize;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int No;

    public Student() {
    }

    public Student(String name, int no) {
        this.name = name;
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", No=" + No +
                '}';
    }
}
