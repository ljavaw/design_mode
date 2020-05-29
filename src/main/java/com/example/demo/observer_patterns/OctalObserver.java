package com.example.demo.observer_patterns;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 21:47
 * @modified by:
 **/
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
