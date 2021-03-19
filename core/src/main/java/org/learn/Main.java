package org.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the number game");

        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);

        NumberGenerator numberGenerator = context.getBean( NumberGenerator.class);

        log.info("Generated number = {} ", numberGenerator.next());


        context.close();
    }
}
