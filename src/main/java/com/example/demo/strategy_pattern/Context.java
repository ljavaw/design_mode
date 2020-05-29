package com.example.demo.strategy_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 10:56
 * @modified by:
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
