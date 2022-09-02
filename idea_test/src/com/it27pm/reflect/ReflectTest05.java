package com.it27pm.reflect;
/*研究一下文件路径问题*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest05 {
    public static void main(String[] args) throws IOException {
        //通过IO流读取classinfo.properties文件
//        FileReader reader = new FileReader("idea_test\\src\\com\\it27pm\\reflect\\classinfo.properties");//这种路径离开了TDEA就行不通了
        /*通用路径写法，但是注意这个属性配置文件必须在类路径下（在src下的都是在类路径下）*/
        //使用通用路径写法获取classinfo.properties的绝对路径（适用于各种操作系统）{是从idea的当前路径开始写}
        String path = Thread.currentThread().getContextClassLoader().getResource("idea_test/src/com/it27pm/reflect/classinfo.properties").getPath();
        System.out.println(path);

/*//获取以src为直接路径的绝对路径直接写配置文件名就行
        String path1 = Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
        System.out.println(path1);*/
        FileReader reader = new FileReader(path);
        Properties p = new Properties();
        p.load(reader);
        reader.close();
        String className = p.getProperty("className");
        System.out.println(className);
    }

}
