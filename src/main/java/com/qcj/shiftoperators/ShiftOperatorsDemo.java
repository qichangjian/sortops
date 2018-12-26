package com.qcj.shiftoperators;

/**
 * 移位运算符测试
 *      java中有三种移位运算符
 *          <<      :     左移运算符，num << 1,相当于num乘以2
 *          >>      :     右移运算符，num >> 1,相当于num除以2
 *          >>>     :     无符号右移，忽略符号位，空位都以0补齐
 *                  无符号右移的规则只记住一点：忽略了符号位扩展，0补最高位
 *                  无符号右移运算符>>> 只是对32位和64位的值有意义
 */
public class ShiftOperatorsDemo {
    public static void main(String[] args) {
        /**
        正数测试
         */
        int number = 15;

        /**
         负数测试
         */
//        int number = -15;
        printInfo(number);//原始的二进制

        //左移
        int left_number1 = number << 1;//左移一位
        int left_number2 = number << 2;//左移两位
        printInfo(left_number1);
        System.out.println(left_number1);
        printInfo(left_number2);
        System.out.println(left_number2);

        //右移
        int right_number1 = number >> 1;//右移一位
        int right_number2 = number >> 2;//右移两位
        printInfo(right_number1);
        System.out.println(right_number1);
        printInfo(right_number2);
        System.out.println(right_number2);

        //无符号右移
        int right_num = number >>> 1;
        printInfo(right_num);
        System.out.println(right_num);

    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
        System.out.println(Integer.toBinaryString(num));
    }

}
