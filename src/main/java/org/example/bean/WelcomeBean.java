package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
    public WelcomeBean() {
        System.out.println("Inside welcomeBean Constructor");
    }

    public String printWelcome() {
        return "Welcome to Spring";
    }

}

