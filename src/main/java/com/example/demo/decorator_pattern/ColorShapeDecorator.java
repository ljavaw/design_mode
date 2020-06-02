package com.example.demo.decorator_pattern;

/**
 * @ClassName: RedShapeDecorator
 * @Description: 颜色装饰
 * @author liujiawei
 * @create 29/05/2020 14:23
 * @version 1.0
 **/
public class ColorShapeDecorator extends ShapeDecorator {

    public ColorShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColorBorder(decoratedShape);
    }

    private void setColorBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
