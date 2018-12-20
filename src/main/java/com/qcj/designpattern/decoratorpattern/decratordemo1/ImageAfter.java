package com.qcj.designpattern.decoratorpattern.decratordemo1;

/**
 * 步骤四：创建不同种类的装饰器
 */
public class ImageAfter extends ImageDecorator {
    public ImageAfter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        super.display();
        after();
    }

    private void after() {
        System.out.println("第二个种类装饰：After");
    }
}
