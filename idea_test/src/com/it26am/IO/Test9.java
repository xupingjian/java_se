package com.it26am.IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("javase");

        InputStreamReader is = new InputStreamReader(fis);
        BufferedReader bf = new BufferedReader(is);

//        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("javase")));

    }
}
