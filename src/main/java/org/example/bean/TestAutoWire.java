package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestAutoWire {
//   @Autowired // property injection
    WelcomeBean welcomeBean;

   @Autowired
   @Qualifier("Qual1")
    QualInterface qualInterface;
//

    public TestAutoWire(){
        System.out.println("Inside TestAuto Wire");
    }

    @Autowired  //constructor injection
    public TestAutoWire(WelcomeBean welcomeBean){
        System.out.println("Inside TestAuto Wire 1");
        this.welcomeBean= welcomeBean;
    }

    //    @Autowired  //setter interject
//    public void setWelcomeBean(WelcomeBean welcomeBean) {
//        this.welcomeBean = welcomeBean;
//    }
//
//
//    public WelcomeBean getWelcomeBean() {
//        return welcomeBean;
//    }


    public void testAutoWire(){
        qualInterface.test();
        System.out.println(welcomeBean.printWelcome());
    }

}
