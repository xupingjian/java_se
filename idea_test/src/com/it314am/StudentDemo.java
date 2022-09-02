package com.it314am;

public class StudentDemo {
    public static void main(String[] args) {
        useStudent((String name,int age)->{
            Student s = new Student(name, age);
            return s;
        });
        //引用构造器
        useStudent(Student::new);

    }
    private static void useStudent(StudentBuilder sb){
        Student s = sb.build("林青霞", 30);
        System.out.println(s.getName()+","+s.getAge());
    }
}
