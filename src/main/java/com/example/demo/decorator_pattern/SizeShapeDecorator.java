package com.example.demo.decorator_pattern;

/**
 * @ClassName: SizeShapeDecorator
 * @Description: 尺寸装饰
 * @author liujiawei
 * @create 29/05/2020 21:14
 * @version 1.0
 **/
public class SizeShapeDecorator extends ShapeDecorator {

    public SizeShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setSizeBorder(decoratedShape);
    }

    private void setSizeBorder(Shape decoratedShape){
        System.out.println("Border Size: 20");
    }
}
