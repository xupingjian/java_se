package com.it25am;

public class MystackTest {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        try {
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");
            mystack.push("fw");

        } catch (MystackException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

    }
}
