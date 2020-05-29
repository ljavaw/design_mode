package com.example.demo.state_pattern;

import lombok.Data;

/**
 * @ClassName: ThreadContext
 * @Description: 环境类
 * @author liujiawei
 * @create 08/01/2020 11:13
 * @version 1.0
 **/
@Data
public class ThreadContext {

    private ThreadState state;

    public ThreadContext(){
        state = new New();
    }

    public void start(){

        ((New)state).start(this);
    }

    public void getCPU(){

        ((Runnable)state).getCPU(this);
    }

    public void suspend(){

        ((Running)state).suspend(this);
    }

    public void resume(){

        ((Blocked)state).resume(this);
    }

    public void stop(){

        ((Running)state).stop(this);
    }
}
