package com.it5;

public class Teacher {
    public void checkScore(int score) throws scoreException{
        if(score<0||score>100){
//
            throw new scoreException("你给的分数有误，分数应该在0——100之间");
        }else{
            System.out.println("分数异常");
        }
    }
}
