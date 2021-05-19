package cn.edw.demo04;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Edwin Xu
 * @date 5/19/2021 2:59 PM.
 */
@SpringBootApplication
@EnableDubbo
public class HelloServiceConsumerSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloServiceConsumerSpringBootApplication.class, args);
    }
}
