package com.it22;

import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        User u1 = new User("zhangsan", new Address("南京", "lingyingdadao", "1242"));
        User u2 = new User("zhangsan", new Address("南京", "lingyingdadao", "1242"));
        System.out.println(u1.equals(u2));//falsse是因为在Address里没有重写equlas方法，因此两次new的内存 地址不相同
    }
}
class User{
    //用户名
    String name;
    //用户住址
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
    //重写equals方法判断两个user对象是否相等，两个对象的用户名和家庭住址相同，表示同一个用户

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(addr, user.addr);//在这里也要要比较user.addr是否相等，就要重写Address里的equals方法

    }


}
class Address{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipcode, address.zipcode);
    }


}