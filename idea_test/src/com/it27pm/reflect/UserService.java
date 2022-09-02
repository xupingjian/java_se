package com.it27pm.reflect;

public class UserService {
    /**
     * 登录方法
     * @param name用户名
     * @param password密码
     * @return true成功
     */
    public boolean login(String name,String password){
        if("admin".equals(name)&& "123".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
