package cn.edw.demo05;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Edwin Xu
 * @date 5/22/2021 10:27 PM.
 */
@ComponentScan("cn.edw.demo05")
@EnableDubbo(scanBasePackages = "cn.edw.demo05")
public class Config {

}
