package com.example.demo.proxy_pattern;

/**
 * @author: ljavaw
 * @description: 代理类
 * @create: 2019-06-18 15:52
 * @modified by:
 **/
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
