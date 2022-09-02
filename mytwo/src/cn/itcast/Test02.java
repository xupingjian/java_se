package cn.itcast;
//使用者
import com.it317pm.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        //遍历服务
        for(MyService my:myServices){
            my.service();
        }
    }
}
