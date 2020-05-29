package com.example.demo.proxy_pattern.dynamic_proxy_glib;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 17:13
 * @modified by:
 **/
public class Client {

    public static void main(String[] args) {
        Engineer engineer = (Engineer)CglibProxy.getProxy(new Engineer());
        engineer.eat();
        engineer.work();
    }
}
