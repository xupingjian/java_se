package com.it25;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 0; i < myStack.getElements().length+1; i++) {
            myStack.push(new Object());
        }

        for (int i = 0; i < myStack.getElements().length; i++) {
            myStack.pop();
        }
    }
}
