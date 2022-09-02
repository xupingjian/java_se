package com.it1;

public class Hat {
    protected String s = "fsf";

    public Hat() {
    }

    public Hat(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    public void learn(){
        System.out.println("好好学习");
    }
}
