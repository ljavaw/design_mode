package com.example.demo.proxy_pattern.dynamic_proxy_jdk;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 16:30
 * @modified by:
 **/
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("sell books");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("David");
        return "David";
    }
}
