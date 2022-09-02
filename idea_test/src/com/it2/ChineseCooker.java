package com.it2;

public class ChineseCooker implements FoodMenu{
    @Override
    public void yuxiangrousi() {
        System.out.println("中国厨师做的鱼香肉丝");
    }

    @Override
    public void shizichaojidan() {
        System.out.println("中国师傅做的西红柿炒鸡蛋");
    }
}
