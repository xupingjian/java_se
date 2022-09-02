package com.it317am;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

//有一个Arraylist<Integer集合，现在我想在这个集合中添加一个字符串数据，如何实现?
public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);

        //用反射越过泛型检查
        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);

        m.invoke(array,"hello");
        m.invoke(array,"world");
        System.out.println(array);
    }
}
