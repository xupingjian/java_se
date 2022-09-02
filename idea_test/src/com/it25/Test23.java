package com.it25;

import java.util.Locale;
import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Size[] values = Size.values();
        System.out.println(values.toString());
        Scanner in = new Scanner(System.in);
        System.out.println("enter a siZe:");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size="+size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if(size == Size.EXTRA_LARGE){
            System.out.println("good");
        }
    }
}
enum Size{
    SMALL("S"),MEDIUM("M"),LARDE("L"),EXTRA_LARGE("XL");
    private Size(String abbreviation){this.abbreviation=abbreviation;}

    public String getAbbreviation() {
        return abbreviation;
    }

    private String abbreviation;
}