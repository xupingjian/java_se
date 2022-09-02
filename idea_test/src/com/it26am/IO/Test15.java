package com.it26am.IO;
/*以后经常改变的数据，可以单独写道一个配置文件中，使用程序动态获取，将来只需要
* 修改这个文件的内容，Java代码无需修改，就可以拿到动态修改后的信息*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*将userinfo文件中的数据加载到properties中*/
public class Test15  {
    public static void main(String[] args) throws IOException {
//        新建一个输入流
        FileReader reader = new FileReader("idea_test\\src\\userinfo");
        Properties p = new Properties();
        //调用Properties对象的load方法将文件中的数据加载到Map集合中，文件中的数据顺着管道加载到Map集合中，1其中等号左边是key,右边是值
        p.load(reader);
        String username = p.getProperty("username");
        System.out.println(username);
        String password = p.getProperty("password");
        System.out.println(password);
    }
}
