package com.example.demo.visitor_pattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
