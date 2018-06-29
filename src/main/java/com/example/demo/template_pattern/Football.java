package com.example.demo.template_pattern;

/**
 * @Author ljw
 * @Description : 具体实现类
 * @Date Created in 11:40 2018/5/24.
 * @Modified By :
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game playing, enjoying");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game finished!");
    }

    @Override
    public void doNextGame(){
        System.out.println("Football second Game!");
    }
}
