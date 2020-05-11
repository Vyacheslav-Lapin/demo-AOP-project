package com.example.aop;

import com.example.aop.service.Serv;
import com.example.aop.service.ServImpl;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@SpringBootApplication

//exclude default configuration in spring-boot (CGLIB)
@SpringBootApplication(exclude = AopAutoConfiguration.class)
// if proxy target = true -> CGLIB else JdkProxy default = false
//@EnableAspectJAutoProxy(proxyTargetClass = true)

@EnableAspectJAutoProxy
public class DemoProjectApplication {

    public static void main(String[] args) {
        val context = SpringApplication.run(DemoProjectApplication.class, args);

        ServImpl bean = context.getBean(ServImpl.class);
        System.out.println("ServImpl" + bean.getClass());

        Serv bean2 = context.getBean(Serv.class);
        System.out.println("Serv2" + bean2.getClass());
    }
}
