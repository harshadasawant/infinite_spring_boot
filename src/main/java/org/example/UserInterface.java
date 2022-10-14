package org.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.bean.WelcomeBean;
import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class UserInterface {
    public static final Log LOGGER = LogFactory.getLog(UserInterface.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        WelcomeBean welcomeBean = applicationContext.getBean(WelcomeBean.class);
        LOGGER.info(welcomeBean.printWelcome());
    }
}

