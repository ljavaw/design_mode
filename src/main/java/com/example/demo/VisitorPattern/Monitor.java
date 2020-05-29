package com.example.demo.VisitorPattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 10:25
 * @modified by:
 **/
public class Monitor implements ComputerPart{


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
