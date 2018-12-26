package com.qcj.fanshe;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 安全管理器
 */
public class TestDemo5 {
    public static void main(String[] args) throws IOException {
        System.setSecurityManager(new MySecurityManage());

        File f = new File("D:/C.class");
        FileInputStream fileInputStream = new FileInputStream(f);
        System.out.println(fileInputStream.read());
        fileInputStream.close();
    }
}

//自定义安全管理器   安全权限访问控制
class MySecurityManage extends SecurityManager{
    @Override
    public void checkRead(String file) {
        if(file.endsWith(".class")){
            throw new SecurityException("不能读取class文件");
        }
    }
}