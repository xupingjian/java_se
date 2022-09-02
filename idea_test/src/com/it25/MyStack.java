package com.it25;

public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack() {
        //一维数组初始化
        this.elements = new Object[10];
        this.index = -1;
    }

    public MyStack(Object[] elements) {
        this.elements = elements;
    }

    //压栈
    public void push(Object obj) {
        if (index >= elements.length - 1) {
            System.out.println("压栈失败，栈已满");
            return;
        }
        index++;
        elements[index] = obj;
        //两句和一句elements[++index] = obj;
        System.out.println("压栈" + obj + "成功，栈帧指向" + index);
    }

    //弹栈
    public void pop() {
        if (index < 0) {
            System.out.println("战役空，弹栈失败");
            return;
        }
        System.out.println("弹栈" + elements[index] + "元素成功" + "栈帧指向" + (index - 1));
        index--;


    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
