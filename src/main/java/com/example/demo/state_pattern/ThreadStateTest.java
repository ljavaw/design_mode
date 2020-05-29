package com.example.demo.state_pattern;

/**
 * @ClassName: ThreadStateTest
 * @Description:
 * @author liujiawei
 * @create 08/01/2020 11:30
 * @version 1.0
 **/
public class ThreadStateTest {

    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();

        threadContext.start();
        threadContext.getCPU();
        threadContext.suspend();
        threadContext.resume();
        threadContext.getCPU();
        threadContext.stop();
    }
}
