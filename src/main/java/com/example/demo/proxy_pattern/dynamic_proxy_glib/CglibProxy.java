package com.example.demo.proxy_pattern.dynamic_proxy_glib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 17:05
 * @modified by:
 **/
public class CglibProxy implements MethodInterceptor {

    Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("###   before invocation");
        Object invoke = method.invoke(target, objects);
        System.out.println("###   end invocation");
        return invoke;
    }

    public static Object getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }
}
