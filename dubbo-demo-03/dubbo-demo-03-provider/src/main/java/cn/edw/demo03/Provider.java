package cn.edw.demo03;

import cn.edw.api.HelloService;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

/**
 * @author Edwin Xu
 * @date 5/15/2021 12:41 AM.
 */

public class Provider {
    public static void main(String[] args) throws Exception{
        ServiceConfig<HelloService> service = new ServiceConfig<HelloService>();
        service.setApplication(new ApplicationConfig("dubbo-demo-03-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
        service.setInterface(HelloService.class);
        service.setRef(new HelloServiceImpl03());
        // 暴露服务
        service.export();
        System.in.read();
    }
}
