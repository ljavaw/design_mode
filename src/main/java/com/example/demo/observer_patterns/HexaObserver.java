package com.example.demo.observer_patterns;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 21:47
 * @modified by:
 **/
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
