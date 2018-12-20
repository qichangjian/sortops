package com.qcj.designpattern.proxypattern.proxy_demo1;

/**
 * 步骤 3
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage(new RealImage());
        image.display();
    }
}
