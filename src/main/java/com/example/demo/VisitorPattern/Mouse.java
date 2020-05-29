package com.example.demo.VisitorPattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 11:00
 * @modified by:
 **/
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
