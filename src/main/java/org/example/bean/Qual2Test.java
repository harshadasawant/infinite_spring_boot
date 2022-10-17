package org.example.bean;

import org.springframework.stereotype.Component;

@Component("Qual2")
public class Qual2Test implements QualInterface{
    @Override
    public void test() {
        System.out.println("from Qual 2 test");
    }
}
