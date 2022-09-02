package com.it25em.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Test4  {
    public static void main(String[] args) {
        User u1 = new User("jack");
        Collection c = new ArrayList();
        c.add(u1);
        User u2 = new User("jack");
        System.out.println(c.contains(u2));//判断一下结果(false),在这里contains方法底层调用equals方法，因为在
        //类User里没有重写equlas方法,故调用object的equals方法（object的equals方法比较是==,比较的是内存地址），故结果为false，
        //如果在类user中重写equals方法，会调用User里的equals方法
    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }


}