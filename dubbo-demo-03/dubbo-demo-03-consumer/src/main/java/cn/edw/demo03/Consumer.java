package cn.edw.demo03;

import cn.edw.api.HelloService;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * @author Edwin Xu
 * @date 5/15/2021 12:45 AM.
 */

public class Consumer {
    public static void main(String[] args) throws Exception {
        ReferenceConfig<HelloService> reference = new ReferenceConfig<HelloService>();
        reference.setApplication(new ApplicationConfig("dubbo-demo-03-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
        reference.setInterface(HelloService.class);
        HelloService service = reference.get();
        System.out.println(service.hello("edw", "how are you?"));
        System.in.read();
    }
}
