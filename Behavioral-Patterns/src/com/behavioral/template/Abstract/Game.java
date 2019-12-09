package com.behavioral.template.Abstract;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/9 12:26
 */
public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

}
