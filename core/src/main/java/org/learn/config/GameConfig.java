package org.learn.config;

import org.learn.GuessCount;
import org.learn.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    private int maxNumber = 50;
    private int guessCount=8;

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }
}
