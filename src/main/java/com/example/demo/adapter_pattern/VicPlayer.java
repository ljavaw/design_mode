package com.example.demo.adapter_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 20:47
 * @modified by:
 **/
public class VicPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVic(String fileName) {
        System.out.println("Playing vic file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
