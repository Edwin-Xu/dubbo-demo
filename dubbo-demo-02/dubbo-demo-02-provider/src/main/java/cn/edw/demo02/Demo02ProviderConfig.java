package cn.edw.demo02;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Edwin Xu
 * @date 5/14/2021 11:12 PM.
 */
@Configuration
@EnableDubbo(scanBasePackages = {"cn.edw.demo02"})
public class Demo02ProviderConfig {
    @Bean
    public ProviderConfig providerConfig(){
        return new com.alibaba.dubbo.config.ProviderConfig();
    }

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-demo-02-provider");
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setPort(2181);
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20881);
        return protocolConfig;
    }
}
