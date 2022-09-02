import com.it317pm.MyService;

module mytwo {
    requires idea.test;
    uses MyService;//服务使用者只需要面向接口操作
}