package com.example.demo.visitor_pattern;

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
