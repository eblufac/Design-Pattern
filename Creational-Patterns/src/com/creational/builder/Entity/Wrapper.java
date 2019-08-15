package com.creational.builder.Entity;

import com.creational.builder.Interface.Packing;

/**
 * @author lgy
 * @version 1
 * @description 纸盒类
 * @date 2019/8/15 18:04
 */
public class Wrapper implements Packing {

    @Override
    public String packing() {
        return "Wrapper";
    }
}
