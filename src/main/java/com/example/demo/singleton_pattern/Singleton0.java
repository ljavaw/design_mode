package com.example.demo.singleton_pattern;

/**
 * @ClassName: Singleton0
 * @Description: 懒汉式，线程不安全
 * @author liujiawei
 * @create 2019-09-07 16:59
 * @version 1.0
 **/
public class Singleton0 {

    private static Singleton0 INSTANCE;

    private Singleton0(){}

    /**
     * @Author liujiawei
     * @Description 获得单例对象
     * @Date 17:26 2019-09-07
     * @Param []
     * @return com.example.design_patterns.singleton_pattern.Singleton0
     **/
    public static Singleton0 getInstance(){

        if(INSTANCE == null){
            INSTANCE = new Singleton0();
        }
        return INSTANCE;
    }

}
