package com.example.demo.visitor_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 10:23
 * @modified by:
 **/
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
