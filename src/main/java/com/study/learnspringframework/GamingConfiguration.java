package com.study.learnspringframework;

import com.study.learnspringframework.game.GameRunner;
import com.study.learnspringframework.game.GamingConsole;
import com.study.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new MarioGame();

    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);

    }
}
