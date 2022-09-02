package com.it25em.collection;



import java.util.TreeSet;

/*对自定义的类型来说,treeSet无法排序
* 以下程序抛出异常java.lang.ClassCastException，因为Person类没有实现java.lang.Comparable接口
* */
public class Test17 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(22);
        Person p3 = new Person(12);
        Person p4 = new Person(30);
//        创建TreeSet集合
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for (Person p :persons
             ) {
            System.out.println(p);
        }
    }
}
class Person {
    private  int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }


}
