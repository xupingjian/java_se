package com.it27pm.reflect;

import java.util.ResourceBundle;

/*java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
* 使用这种方式的时候，属性配置文件XXX.properties必须放到类路径下*/
public class ResourceBundleTest {
    public static void main(String[] args) {
//        如果配置文件不在类路径下，需要用上ideal中的相对路径，如果配置文件在类路径下，只需要写文件名就好
        ResourceBundle bundl = ResourceBundle.getBundle("idea_test\\src\\com\\it27pm\\reflect\\classinfo");
        String className = bundl.getString("className");
        System.out.println(className);

        ResourceBundle bundle= ResourceBundle.getBundle("set");
        String className1 = bundle.getString("className");
        System.out.println(className1);
    }
}
