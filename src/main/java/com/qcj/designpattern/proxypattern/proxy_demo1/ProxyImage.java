package com.qcj.designpattern.proxypattern.proxy_demo1;

public class ProxyImage implements Image {
    private RealImage realImage;

    public ProxyImage(RealImage realImage) {
        this.realImage = realImage;
    }

    @Override
    public void display() {
        before();
        realImage.display();
    }

    private void before() {
        System.out.println("Proxy befor!");
    }
}
