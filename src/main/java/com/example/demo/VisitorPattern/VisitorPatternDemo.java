package com.example.demo.VisitorPattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 11:04
 * @modified by:
 **/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
