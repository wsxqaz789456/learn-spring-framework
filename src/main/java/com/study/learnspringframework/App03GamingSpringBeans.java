package com.study.learnspringframework;

import com.study.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        ac.getBean(GameRunner.class).run();

        //스프링을 통해 의존성 주입

    }
}
