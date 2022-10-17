package org.example;

import org.example.bean.TestAutoWire;
import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserInterface {
       public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestAutoWire testAutoWire = applicationContext.getBean(TestAutoWire.class);
        testAutoWire.testAutoWire();
    }
}

