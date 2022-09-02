import com.it317pm.MyService;
import com.it317pm.impl.Czxy;
import com.it317pm.impl.Itheima;

module idea.test {
    exports com.it317am;
    exports com.it317pm;
//    provides MyService with Itheima;//服务的提供者只需要接口的具体实现类
    provides MyService with Czxy;//服务的提供者只需要接口的具体实现类
}
