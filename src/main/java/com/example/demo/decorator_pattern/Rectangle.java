package com.example.demo.decorator_pattern;

/**
 * @ClassName: Rectangle
 * @Description: 接口的具体实现，各个装饰器就是对此进行装饰
 * @author liujiawei
 * @create 29/05/2020 14:15
 * @version 1.0
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
