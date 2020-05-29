package com.example.demo.singleton_pattern;

/**
 * @ClassName: Singleton1
 * @Description: 饿汉式
 * @author liujiawei
 * @create 2019-09-07 17:31
 * @version 1.0
 **/
public class Singleton1 {

    private static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    /**
     * @Author liujiawei
     * @Description 获得单例对象
     * @Date 17:33 2019-09-07
     * @Param []
     * @return com.example.design_patterns.singleton_pattern.Singleton1
     **/
    public static Singleton1 getInstance(){

        return INSTANCE;
    }
}
