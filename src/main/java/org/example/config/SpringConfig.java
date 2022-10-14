package org.example.config;

import org.example.bean.WelcomeBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "org.example.*")
public class SpringConfig {
//@Bean
//public WelcomeBean welcomeBean() {
//    return new WelcomeBean();
//}


}
