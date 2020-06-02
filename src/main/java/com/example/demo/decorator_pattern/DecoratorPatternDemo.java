package com.example.demo.decorator_pattern;

/**
 * @ClassName: DecoratorPatternDemo
 * @Description: 装饰器模式
 * @author liujiawei
 * @create 29/05/2020 14:28
 * @version 1.0
 **/
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape shape = new SizeShapeDecorator(new ColorShapeDecorator(new Rectangle()));
        shape.draw();
    }

}
