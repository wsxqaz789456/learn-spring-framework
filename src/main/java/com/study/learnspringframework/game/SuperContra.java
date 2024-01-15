package com.study.learnspringframework.game;

public class SuperContra implements GamingConsole{

    @Override
    public void up() {
        System.out.println("move");;
    }

    @Override
    public void down() {
        System.out.println("go down");;
    }

    @Override
    public void left() {
        System.out.println("go back ");;
    }

    @Override
    public void right() {
        System.out.println("acce");;
    }
}
