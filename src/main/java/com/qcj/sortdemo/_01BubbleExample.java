package com.qcj.sortdemo;

/**
 * 冒泡排序：
 * 算法分析：
 *      冒泡排序最好的情况是初始状态是正序的，一次扫描即可完成排序，所以最好的时间复杂度为 O(N)；
 *      最坏的情况是反序的，此时最坏的时间复杂度为 O(N^2)。
 *      平均情况，每轮 N/2 次循环，N 轮时间复杂度为 O(N^2)。
 * 算法是稳定的，因为当 a=b 时，由于只有大于才做交换，故 a 和 b 的位置没有机会交换，所以算法稳定。
 * 空间复杂度为 O(1)，不需要额外空间。
 */
public class _01BubbleExample {
    public static void main(String[] args) {
        //冒泡排序
        int[] source = {4,2,3,1,7,9};
        bubbleSort(source);
        //冒泡排序调优
//        bubbleSortOptimize(source);

    }


    /*
    1.1：冒泡排序
    冒泡排序算法运行起来非常慢，但在概念上它是排序算法中最简单的，因此冒泡排序算法在刚开始研究排序技术时是一个非常好的算法。
    冒泡排序算法的基本流程是：每一轮从头开始两两比较，将较大的项放在较小项的右边，这样每轮下来保证该轮最大的数在最右边。
    */
    public static void bubbleSort(int[] source){
        int temp;
        for (int i = source.length-1;i>0; i--) {
            for (int j = 0; j < i; j++) {
                if(source[j]>source[j+1]){
                    temp = source[j+1];//交换
                    source[j+1]=source[j];
                    source[j] = temp;
                }
            }
        }
        PrintUtil.printlnArray(source);
    }

    /*
    1.2：冒泡排序：优化
     冒泡排序算法还有个可以改进的地方，就是在算法中加入一个布尔变量标识该轮有没有进行数据的交换，
     若在某一次排序中未发现气泡位置的交换，则说明待排序的无序区中所有的项均已满足排序后的结果。
     */
    public static void bubbleSortOptimize(int[] source){
        boolean isExchange;
        int temp;
        for (int i = source.length-1;i > 0;i --) {
            isExchange = false;
            for (int j = 0; j < i; j++) {
                if(source[j]>source[j+1]){
                    temp=source[j+1];
                    source[j+1]=source[j];
                    source[j] = temp;
                    isExchange = true;
                }
            }
            if(!isExchange) break;//如果没交换位置证明剩余已经是有序的，直接返回
        }
        PrintUtil.printlnArray(source);
    }

}
