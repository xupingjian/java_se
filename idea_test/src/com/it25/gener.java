package com.it25;

/*public class gener {
    public void show(String s){
        System.out.println(s);
    }
    public void show(Integer i){
        System.out.println(i);
    }
    public void show(Boolean b){
        System.out.println(b);
    }
}*/
/*
    public class gener<T> {
        public void show(T t){
            System.out.println(t);
        }
}*///泛型类改进
// 泛型方法改进
public class gener {
    public <T> void show(T t){
        System.out.println(t);
    }
}