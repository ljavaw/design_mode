package com.example.demo.proxy_pattern.dynamic_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 16:31
 * @modified by:
 **/
public class MyInvocationHandler implements InvocationHandler {


    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     * @param proxy    代理类
     * @param method   正在调用的方法
     * @param args     方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用代理类");
        if(method.getName().equals("sellBooks")){

            int invoke = (int)method.invoke(realSubject, args);
            System.out.println("invoke sellBooks method");
            return invoke;
        } else if(method.getName().equals("speak")){
            String name = (String) method.invoke(realSubject, args);
            System.out.println("invoke speak method");
            return name;
        }
        return null;
    }
}
