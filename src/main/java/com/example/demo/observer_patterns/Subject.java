package com.example.demo.observer_patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 21:37
 * @modified by:
 **/
public class Subject {

    List<Observer> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
