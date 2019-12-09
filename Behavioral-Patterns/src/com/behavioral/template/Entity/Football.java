package com.behavioral.template.Entity;

import com.behavioral.template.Abstract.Game;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 12:30
 */
public class Football extends Game {

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
