package com.qcj.recursion;

/**
 * 递归实现阶乘
 */
public class Factorial {

    public static void main(String[] args) {
        //阶乘测试
        System.out.println(jc(4));

        //不死神兔测试(斐波那契数列)
        all_bsst(10);
    }

    /**
     * 阶乘
     * @param n
     * @return
     */
    public static int jc(int n){
        if(n == 1){
            return 1;
        }else{
            return n * jc(n-1);
        }
    }

    /**
     * 不死神兔
     * 1 1 2 3 5
     * @return
     */
    public static int bsst(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return bsst(n-1) + bsst(n-2);
        }
    }

    /**
     * 求总个数
     */
    public static void all_bsst(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(bsst(i));
            sum += bsst(i);
        }
        System.out.println(sum);
    }
}
