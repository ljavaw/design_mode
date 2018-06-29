package com.example.demo.template_pattern;

/**
 * @Author ljw
 * @Description : 测试类
 * @Date Created in 11:46 2018/5/24.
 * @Modified By :
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        System.out.println();
        Game football = new Football();
        football.play();
        football.doNextGame();
    }
}
