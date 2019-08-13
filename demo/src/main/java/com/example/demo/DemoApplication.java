package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
   //Youtube Vedio:  https://www.youtube.com/watch?v=35EQXmHKZYs

    public static void main(String[] args) {
//Spring framework create every component(Bean) it has, spring framework injects object into your application.
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//get instance
//Spring container (create) --> Spring Bean --> Singleton / Prototype scope()
        Alien a = context.getBean(Alien.class);
        a.setAid(111);
        System.out.println(a.getAid());
        a.show();

        Alien a1 = context.getBean(Alien.class);
        a1.show();
        a1.setAid(222);
        System.out.println(a1.getAid());
        System.out.println(a.getAid());



    }

}
