package com.example.demo.decorator_pattern;

/**
 * @ClassName: ShapeDecorator
 * @Description:
 * @author liujiawei
 * @create 29/05/2020 14:17
 * @version 1.0
 **/
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
