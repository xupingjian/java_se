package com.it1;

public class Test18 {
    public static void main(String[] args) {
        //多态
        AA aa = new DDimpl();
        BB bb = new DDimpl();
//        CC cc = new DDimpl();
        if(aa instanceof BB){
            BB b2 = (BB) aa;
            b2.m2();}

        //经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转
        //但是一定要注意，运行时可能会出现ClASScastException异常（因为这里强转为CC接口，CC接口并没有与实现类impl产生关系）
        if(aa instanceof CC){
            CC b3 = (CC) aa;
            b3.m3();
        }
        DDimpl b4 = (DDimpl) aa;
        b4.m2();
    }
}

interface AA {
    void m1();
}

interface BB {
    void m2();
}

interface CC {
    void m3();
}

class DDimpl implements AA, BB {
    //实现AA接口的m1()
    public void m1() {
    }

    //实现BB接口的m2
    public void m2() {
        System.out.println("m2...");
    }

    //实现CC接口的m3
    public void m3() {
        System.out.println("m3");
    }
}