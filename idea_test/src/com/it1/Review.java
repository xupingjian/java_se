package com.it1;

public class Review {
    public static void main(String[] args) {
        //局部变量
        int i = 100;
        Student s = new Student();
    }
}
class Student{
    private int no;
    private String name;
    static String job = "学习";

    public Student() {
        this(100,"zhangsan");
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
//        System.out.println(job);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //两个实例方法和两个静态方法
    public static void m1(){
        System.out.println("m1执行");
    }
    public static void m2(){
        System.out.println("m2被执行");
    }
    public void study(){
        System.out.println(this.getName()+"正在学习");//这里name=this.name=getName=this.getName
    }
}