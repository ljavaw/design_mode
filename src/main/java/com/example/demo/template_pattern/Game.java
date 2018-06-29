package com.example.demo.template_pattern;

/**
 * @Author ljw
 * @Description :抽象模板角色类
 * @Date Created in 11:22 2018/5/24.
 * @Modified By :
 */
public abstract class Game {

    /**
     * 基本方法待子类去实现
     */
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 钩子方法
     * (钩子方法的名字应当以do开始，这是熟悉设计模式的Java开发人员的标准做法。在HttpServlet类中，也遵从这一命名规则，如doGet()、doPost()等方法)
     */
     public void doNextGame(){

     }
    /**
     * 模板方法
     */
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}
