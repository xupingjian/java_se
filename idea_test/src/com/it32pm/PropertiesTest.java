package com.it32pm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("idea_test\\osw2.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
//        System.out.println(number);
        if(number>=3){
            System.out.println("游戏结束，想玩请充值");
        }else{
            Game.start();
            number+=1;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("idea_test\\osw2.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
