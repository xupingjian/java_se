package com.it25;

public class GenericDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("abc");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());

        Generic<String> st = new Generic<>();
        st.setT("abc");
        System.out.println(st.getT());
        Generic<Integer> it = new Generic<>();
        it.setT(39);
        System.out.println(it.getT());

 /*       gener sa = new gener();
        sa.show("abc");
        sa.show(30);
        sa.show(true);*/
/*        gener<String> qw = new gener<>();
        qw.show("abc");
        gener<Boolean> bt = new gener<>();
        bt.show(false);
        gener<Integer> ij = new gener<>();
        ij.show(100);*/
        gener ge = new gener();
        ge.show("abc");
        ge.show(15);
        ge.show(false);
        ge.show(13.25);

    }
}
