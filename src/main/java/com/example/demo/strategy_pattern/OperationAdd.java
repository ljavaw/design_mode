package com.example.demo.strategy_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 10:54
 * @modified by:
 **/
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
