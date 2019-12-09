package com.behavioral.template.Entity;

import com.behavioral.template.Abstract.Game;

/**
 * @author lgy
 * @version 1
 * @description
 * 板球
 * @date 2019/12/9 12:28
 */
public class Cricket extends Game {

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
