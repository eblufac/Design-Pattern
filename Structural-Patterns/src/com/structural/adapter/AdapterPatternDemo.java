package com.structural.adapter;

import com.structural.adapter.Entity.AudioPlayer;

/**
 * @author lgy
 * @version 1
 * @description demo
 * @date 2019/8/16 9:34
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
    }
}
