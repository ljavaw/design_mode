package com.example.demo.proxy_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-18 15:55
 * @modified by:
 **/
public class Test {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
