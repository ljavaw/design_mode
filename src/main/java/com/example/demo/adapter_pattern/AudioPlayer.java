package com.example.demo.adapter_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-24 20:41
 * @modified by:
 **/
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if("mp3".equals(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if ("vlc".equals(audioType) || "mp4".equals(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
