package com.it4;

import java.time.LocalDate;

public class ManagerTest {

    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);


        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker",5000,1989,10,1);
        staff[2] = new Employee("Tommy Taster",40000,1990,3,15);

        for (Employee e:staff
             ) {
            System.out.println("name= " + e.getName()+ ",salary= "+ e.getSalary() );

        }
    }
}
class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    private void siyou(){
        System.out.println("hahahh");
    }
}
class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
    public void setBonus(double b){
        bonus = b;
    }
}
