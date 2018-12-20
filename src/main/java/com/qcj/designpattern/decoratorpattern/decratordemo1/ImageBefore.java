package com.qcj.designpattern.decoratorpattern.decratordemo1;
/**
 * 步骤四：创建不同种类的装饰器
 */
public class ImageBefore extends ImageDecorator {
    public ImageBefore(Image image) {
        super(image);
    }

    @Override
    public void display() {
        before();
        super.display();
    }

    private void before() {
        System.out.println("第一个种类装饰：Before");
    }
}
