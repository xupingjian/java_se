package com.it25em.collection;
/*自定义泛型，自定义泛型的时候，<>中的是一个标识符，随便写
一般用E或T*/
public class Tets10<T> {
    public T get(){
        return null;
    }

    public static void main(String[] args) {
        Tets10<String> o  = new Tets10<>();
        String s = o.get();//自动返回一个String类型

    }
}
