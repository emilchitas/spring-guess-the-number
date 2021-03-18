package org.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
        public static final String CONFIG_LOCATION = "beans.groovy";

    public static void main(String[] args) {
        log.info("Guess the number game");

        ConfigurableApplicationContext context=new GenericGroovyApplicationContext(CONFIG_LOCATION);

        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);

        log.info("Got a number generated: {} ", numberGenerator.next());


        context.close();
    }
}
