package com.structural.proxy.Entity;

import com.structural.proxy.Interface.Image;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/3 13:09
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

}
