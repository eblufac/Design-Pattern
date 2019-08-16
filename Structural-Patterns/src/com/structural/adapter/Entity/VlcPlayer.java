package com.structural.adapter.Entity;

import com.structural.adapter.Interface.AdvanceMediaPlayer;

/**
 * @author lgy
 * @version 1
 * @description Vlc实体类
 * @date 2019/8/16 9:17
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
