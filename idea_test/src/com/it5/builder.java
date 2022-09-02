package com.it5;

public class builder {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        build.append("sog");
        build.append("str");
        build.delete(2,3);

        String fg = build.toString();

        System.out.println(fg);
        System.out.println(build.length());

        System.out.println(fg);
    }
}
