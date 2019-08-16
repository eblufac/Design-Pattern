package com.structural.adapter.Entity;

import com.structural.adapter.Interface.AdvanceMediaPlayer;

/**
 * @author lgy
 * @version 1
 * @description Mp4实体类
 * @date 2019/8/16 9:18
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
