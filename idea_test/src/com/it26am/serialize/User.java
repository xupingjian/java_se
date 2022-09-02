package com.it26am.serialize;

import java.io.Serializable;

public class User implements Serializable {
    private int No;
    /*如果希望某个对象不参加序列化，加transient关键字*/
    private transient String name;

    public User() {
    }

    public User(int no, String name) {
        No = no;
        this.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "No=" + No +
                ", name='" + name + '\'' +
                '}';
    }
}
