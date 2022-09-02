package com.it25am;



public class Mystack{
    Object[] elements = new Object[10];

    int index = 0;

    public Mystack() {
    }

    public Mystack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }
    public void push(Object o) throws MystackException {
        elements[index] = o;
        index+=1;
        if(index==10){
            /*System.out.println("栈已满，压栈失败");
            return;*/
//           采用异常处理
            throw new MystackException("栈已满，压栈失败");
        }
    }
    public void pop(){
        Object[] objects = new Object[10];

        System.arraycopy(objects,index-1,elements,index-1,10-index+1);
        for (int i = 0; i < elements.length; i++) {
            System.out.println("haha  "+elements[i]);
        }
        if(index<=0){
            System.out.println("栈为空，弹栈失败");
            return;
        }
        index-=1;

    }
}