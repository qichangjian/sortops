package com.qcj.sortdemo;

/**
 * 二分查找
 * 1.二分查找又称折半查找，它是一种效率较高的查找方法。
 * 2.二分查找要求：（1）必须采用顺序存储结构 （2）.必须按关键字大小有序排列
 * 3.原理：将数组分为三部分，依次是中值（所谓的中值就是数组中间位置的那个值）前，中值，中值后
 * 将要查找的值和数组的中值进行比较，若小于中值则在中值前 面找，若大于中值则在中值后面找，
 * 等于中值时直接返回。然后依次是一个递归过程，将前半部分或者后半部分继续分解为三部分。
 * 4.实现：
 * 二分查找的实现用递归和循环两种方式
 */
public class _00BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 12, 33, 87, 90, 97, 108, 561};
        System.out.println("循环查找:" + binarySearch(arr, 87));
        System.out.println("递归查找:" + binSearch(arr, 0, arr.length - 1, 87));
    }

    //循环实现二分查找算法arr 已排好序的数组x 需要查找的数-1 无法查到数据
    public static int binarySearch(int[] srcArray, int des) {
        //定义初始最小、最大索引
        int low = 0;
        int high = srcArray.length - 1;
        //确保不会出现重复查找，越界
        while (low <= high) {
            //计算出中间索引值
            int middle = (high + low) >>> 1;//防止溢出
            if (des == srcArray[middle]) {
                return middle;
                //判断下限
            } else if (des < srcArray[middle]) {
                high = middle - 1;
                //判断上限
            } else {
                low = middle + 1;
            }
        }
        //若没有，则返回-1
        return -1;
    }

    /**
     * 二分查找递归实现。
     * @param srcArray 有序数组
     * @param start    数组低地址下标
     * @param end      数组高地址下标
     * @param key      查找元素
     * @return 查找元素不存在返回-1
     */
    public static int binSearch(int srcArray[], int start, int end, int key) {
//        int mid = (end - start) / 2 + start;
        int mid = (end - start) >>> 1;
        if (srcArray[mid] == key) {
            return mid;
        }
        if (start >= end) {
            return -1;
        } else if (key > srcArray[mid]) {
            return binSearch(srcArray, mid + 1, end, key);
        } else if (key < srcArray[mid]) {
            return binSearch(srcArray, start, mid - 1, key);
        }
        return -1;
    }
}
