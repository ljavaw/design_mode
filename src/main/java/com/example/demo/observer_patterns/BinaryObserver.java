package com.example.demo.observer_patterns;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 21:41
 * @modified by:
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
