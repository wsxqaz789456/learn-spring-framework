package com.study.learnspringframework;

import com.study.learnspringframework.game.GameRunner;
import com.study.learnspringframework.game.MarioGame;
import com.study.learnspringframework.game.SuperContra;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var , 컴파일 단계에서 지역변수 타입 추론

//        var marioGame = new MarioGame();
//        var superContra = new SuperContra();
        // GameRunner 생성자에서 MarioGame 객체를 변수로 받음
        // superContra 객체를 받고 싶을 경우 GameRunner 클래스의 지역변수를 변경해야함.
        // game 인스턴스를 생성해서 생성자로 전달, 정보를 변경할 때 많은 양을 수정해야함, 강한결합

//        var gameRunner = new GameRunner(marioGame);
//        gameRunner.run();

        //GamingConsole 인터페이스를 통한 느슨한 결합
        var superContra = new SuperContra(); //1. 객체 생성
        var marioGame = new MarioGame();
        // marioGame과 superContra는 GamingConsole의 구현체
        //GameRunner의 경우 GamingConsole을 지역변수로 받기 때문에 구현체를 변수로 지정가능
        //GameRunner 객체의 구성요소를 변경할 필요가 없어짐.
        var gameRunner = new GameRunner(marioGame);
            //2. 객체 생성 + 의존성 연결
            //GamingConsole은 GamRunner의 의존성
            //객체가 많아질수록 수 많은 의존성 연결이 필요해짐
        gameRunner.run();
    }
}
