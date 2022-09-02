package com.it2;

public class AmericCooker implements FoodMenu{
    @Override
    public void shizichaojidan() {
        System.out.println("西餐师傅做的西红柿炒鸡蛋");
    }

    @Override
    public void yuxiangrousi() {
        System.out.println("西餐师傅做的鱼香肉丝");
    }
}
