package ru.vlapin.experiments.demoproject;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.vlapin.experiments.demoproject.services.Serv;

@SpringBootApplication
public class DemoProjectApplication {

	public static void main(String[] args) {
    val context = SpringApplication.run(DemoProjectApplication.class, args);

    Serv bean = context.getBean(Serv.class);
    System.out.println("context.getBean(Serv.class) = " + bean.getClass());
    System.out.println("bean.math(5) = " + bean.math(5));
  }


}
