package com.structural.adapter;

import com.structural.adapter.Entity.Mp4Player;
import com.structural.adapter.Entity.VlcPlayer;
import com.structural.adapter.Interface.AdvanceMediaPlayer;
import com.structural.adapter.Interface.MediaPlayer;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/8/16 9:20
 */
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer;

    /**
     *  适配器可以封装不同实体类
     */
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }


    /**
     * @description 对外提供统一接口，具体实现类及方法由适配器决定
     *             因此调用方只需调用接口，就可以使用不同实体类提供的功能
     * @param audioType
     * @param filename
     */
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(filename);
        }
    }
}
