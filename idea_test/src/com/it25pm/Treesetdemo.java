package com.it25pm;

import java.util.TreeSet;

/*对自定义的类型来说,treeSet无法排序
 * 以下程序抛出异常java.lang.ClassCastException，因为Person类没有实现java.lang.Comparable接口
 * */
public class Treesetdemo {
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
class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person o) {
        /*compareTo方法的返回值很重要
        * 等于0表示相同，value会覆盖
        * >0,会继续在右子树上找
        * <0,会继续在左子树上找*/
        return this.age-o.age;//采用自平衡二叉树规则（自平衡二叉树采用中序遍历，左根右），如果两个位置互换，逻辑相反
    }

}