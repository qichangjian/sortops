package com.qcj.designpattern.decoratorpattern.decratordemo1;

public class DecratorPatternDemo {
    public static void main(String[] args) {
        //在前边装饰
        Image image = new ImageBefore(new RealImage());
        image.display();

        //在后边装饰
        Image image1 = new ImageAfter(new RealImage());
        image1.display();
    }
}
