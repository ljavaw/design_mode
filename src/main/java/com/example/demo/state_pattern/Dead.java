package com.example.demo.state_pattern;

/**
 * @ClassName: Dead
 * @Description: 具体状态类：死亡状态
 * @author liujiawei
 * @create 08/01/2020 11:11
 * @version 1.0
 **/
public class Dead extends ThreadState {

    public Dead() {
        stateName="死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
