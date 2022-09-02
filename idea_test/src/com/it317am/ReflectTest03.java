package com.it317am;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
/*        Student s = new Student();
        s.study();*/

/*class.txt
className=xxx
methodName=xxx*/

    //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("idea_test\\class.txt");
        prop.load(fr);
//        System.out.println(prop);
        fr.close();
        /* className=com.it317am.Student
        methodName=study*/
        String className = prop.getProperty("className");
//        System.out.println(className); //com.it317am.Student
        String methodName = prop.getProperty("methodName");

        //通过反射来使用
        Class<?> c = Class.forName(className);//com.it317am.Student

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);

    }

}
