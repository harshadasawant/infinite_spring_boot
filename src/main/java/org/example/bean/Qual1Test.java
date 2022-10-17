package org.example.bean;

import org.springframework.stereotype.Component;

@Component(value="Qual1")
public class Qual1Test implements QualInterface{
    @Override
    public void test() {
        System.out.println("from qual1 Test");
    }
}

//Qual1Test Qual1 = new Qual1Test();