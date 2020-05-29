package com.example.demo.proxy_pattern;

/**
 * @author: ljavaw
 * @description: 真实类
 * @create: 2019-06-18 15:49
 * @modified by:
 **/
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    public void loadFromDisk(String fileName){

        System.out.println("loading " + fileName);
    }
}
