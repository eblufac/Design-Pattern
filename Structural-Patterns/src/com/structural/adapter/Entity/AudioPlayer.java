package com.structural.adapter.Entity;

import com.structural.adapter.Interface.MediaPlayer;
import com.structural.adapter.MediaAdapter;

/**
 * @author lgy
 * @version 1
 * @description MediaPlayer的实现类
 * @date 2019/8/16 9:26
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {

        //内置支持Mp3播放
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        } else if (audioType.equalsIgnoreCase("vlc") ||
            audioType.equalsIgnoreCase("mp4")) {
            /**
             * 如果是MP4或者vlc文件，则需要使用外部类提供的功能，因此利用适配器调用其功能
             */
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
