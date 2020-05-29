package com.example.demo.singleton_pattern;

/**
 * @ClassName: Singleton
 * @Description: 懒汉式，线程安全
 * @author liujiawei
 * @create 2019-09-07 16:59
 * @version 1.0
 **/
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){}

    /**
     * @Author liujiawei
     * @Description 获得单例对象
     * @Date 17:28 2019-09-07
     * @Param []
     * @return com.example.design_patterns.singleton_pattern.Singleton
     **/
    public static synchronized Singleton getInstance() {

        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
