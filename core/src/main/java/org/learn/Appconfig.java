package org.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.learn")
public class Appconfig {
    @Bean
    public NumberGenerator numberGenerator(){
        return new NumberGeneratorImpl();
    }
    @Bean
    public Game game(){
        return new GameImpl();
    }
}
