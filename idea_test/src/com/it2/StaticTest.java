package com.it2;

public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("tom",4000);
        staff[1] = new Employee("dick",6000);
        staff[2] = new Employee("Harry",6500);

        for (Employee e :staff) {
            e.setId();
            System.out.println("name  " + e.getName()+",id="+e.getId()+",salary="+e.getSalary());

        }
        int n = Employee.getNextId();//调用静态方法
        System.out.println("Next available id = "+ n);

    }
}
