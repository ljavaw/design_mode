package com.example.demo.proxy_pattern.dynamic_proxy_jdk;

import java.lang.reflect.Proxy;

/**
 * @author: ljavaw
 * @description: 调用类
 * @create: 2019-06-18 16:39
 * @modified by:
 **/
public class Client {

    public static void main(String[] args) {
        //真实对象
        RealSubject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);

        //代理对象
        Subject subject = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        subject.sellBooks();
        subject.speak();
    }
}
