package com.it25am;

public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> g1 = new GenericImpl<>();
        g1.show("abc");
        GenericImpl<Integer> g2 = new GenericImpl<>();
        g2.show(30);
    }
}
