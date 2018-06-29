package com.example.demo.template_pattern;

/**
 * @Author ljw
 * @Description : 具体实现类
 * @Date Created in 11:37 2018/5/24.
 * @Modified By :
 */
public class Cricket extends  Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game intiialize.....");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game start, enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
