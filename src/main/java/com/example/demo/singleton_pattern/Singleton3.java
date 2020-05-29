package com.example.demo.singleton_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 15:08
 * @modified by:
 **/
public enum Singleton3 {

    INSTANCE;

    private SingletonTest instance;

    Singleton3(){

        instance = new SingletonTest();
    }

    /**
     * @Author liujiawei
     * @Description 获得单例对象
     * @Date 18:58 2019-09-07
     * @Param []
     * @return com.example.design_patterns.singleton_pattern.SingletonTest
     **/
    public SingletonTest getInstance(){
        return instance;
    }

}
