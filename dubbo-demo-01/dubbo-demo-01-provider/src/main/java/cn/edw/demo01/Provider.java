package cn.edw.demo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 5/14/2021 3:15 PM.
 */

public class Provider {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider-config.xml"});
        ctx.start();
        System.in.read();
    }
}
