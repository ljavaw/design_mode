package com.example.demo.adapter_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 20:48
 * @modified by:
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVic(String fileName) {
    }

    @Override
    public void playMp4(String fileName) {

        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
