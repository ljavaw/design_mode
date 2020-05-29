package com.example.demo.singleton_pattern;

/**
 * @author: ljavaw
 * @description: 登记式/静态内部类
 * @create: 2019-06-18 14:26
 * @modified by:
 **/
public class Singleton2 {

    private Singleton2(){}

    public static final Singleton2 getInstance(){

        return SingletonHolder.INSTANCE;
    }

    public static class SingletonHolder{

        public static final Singleton2 INSTANCE = new Singleton2();
    }
}
