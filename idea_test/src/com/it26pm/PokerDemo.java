package com.it26pm;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //装牌
        String[] colors = {"♦","♣","♠","❤"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color:colors){
            for(String number:numbers){
                array.add(color+number);
            }
        }
        array.add("大王");
        array.add("小王");
//        System.out.println(array);
//发牌
        Collections.shuffle(array);
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<>();
        ArrayList<String> fqyArray = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();
        for(int i = 0;i<array.size();i++){
            String poker = array.get(i);

            if(i>=array.size()-3){
                dpArray.add(poker);

            }else if(i%3==0){
                lqxArray.add(poker);
            }else if(i%3==1){
                lyArray.add(poker);
            }else if(i%3==2){
                fqyArray.add(poker);
            }
        }
        lookpoker("lqx",lqxArray);
        lookpoker("ly",lyArray);
        lookpoker("fqy",fqyArray);
        lookpoker("dp",dpArray);
    }
    //看牌
    public static void lookpoker(String name,ArrayList<String> array){
        System.out.print(name +"的牌是：");
        for(String poker:array){
            System.out.print(poker +" ");
        }
        System.out.println();
    }
}
