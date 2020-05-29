package com.example.demo.singleton_pattern;

/**
 * @author: ljavaw
 * @description: 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @create: 2019-06-18 14:02
 * @modified by:
 **/
public class Singleton4 {

    private static volatile Singleton4 INSTANCE;

    private Singleton4(){}

    /**
     * @Author liujiawei
     * @Description 获得单例对象
     * @Date 18:31 2019-09-07
     * @Param []
     * @return com.example.design_patterns.singleton_pattern.Singleton4
     **/
    public static Singleton4 getInstance(){

        if(INSTANCE == null){
            synchronized (Singleton4.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
