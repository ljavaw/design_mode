package com.example.demo.adapter_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 20:43
 * @modified by:
 **/
public class MediaAdapter implements MediaPlayer {


    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if("vlc".equals(audioType)){
            this.advancedMediaPlayer = new VicPlayer();
        }else if("mp4".equals(audioType)){
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if("vlc".equals(audioType)){
            advancedMediaPlayer.playVic(fileName);
        }else if("mp4".equals(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
