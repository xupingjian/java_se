package com.it27pm.reflect;

import java.util.ArrayList;
import java.util.List;

public class dfg {
    public static void main(String args[]) {
        int i = 5;
        int j = 10;
        System.out.println(i + ~j);/*1.首先~表示非运算符,就是将该数的所有二进制位全取反。但又由于计算机中是以补码的形式存储的,
        所以0 1010全取反是1 0101(只是补码形式,还需要转成原码)。 .
2.此时得到的1 0101只是补码,我们需要将它先转为反码,反码 = 补码-1,得到反码为1 0100。 .
3.我们得到反码后,将它转为原码,原码 = 反码符号位不变,其它位全取反,得到最终的原码为1 1011,转化为十进制就是-11*/


    }
}