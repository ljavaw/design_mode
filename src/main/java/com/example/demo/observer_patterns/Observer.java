package com.example.demo.observer_patterns;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 21:35
 * @modified by:
 **/
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
