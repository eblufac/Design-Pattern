package com.structural.proxy;

import com.structural.proxy.Entity.RealImage;
import com.structural.proxy.Interface.Image;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/3 13:11
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
