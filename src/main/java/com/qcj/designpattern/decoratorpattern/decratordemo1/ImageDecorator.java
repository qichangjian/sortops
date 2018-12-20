package com.qcj.designpattern.decoratorpattern.decratordemo1;

/**
 * 步骤三：创建一个装饰者 抽象类 继承接口
 */
public abstract class ImageDecorator implements Image{
    private Image image;

    public ImageDecorator(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}
