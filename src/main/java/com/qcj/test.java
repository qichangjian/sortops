package com.qcj;

import java.util.Random;

/**
 * >>> 是无符号右移运算符
 * 无符号右移就是将那个数转为2进制然后在前面补0
 * 比如你这就是先将4转换为2进制
 * 000000000很多000100..然后右移一位并在前面补0..
 * 就变成000000000很多000010...
 * 就是2了..
 */
public class test {
    public static void main(String[] args) {
        System.out.println(9 >>> 1);
        while(true){
            System.out.println(new Random().nextInt(1));
        }

    }
}
