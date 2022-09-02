package com.it25am;
/*自定义异常
* 第一步：编写一个类继承Exception或者RuntimeException
* 第二步：提供两个构造方法，一个无参的,一个带有String参数的*/
public class MyException extends RuntimeException {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
