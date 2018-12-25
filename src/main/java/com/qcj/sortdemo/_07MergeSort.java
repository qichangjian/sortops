package com.qcj.sortdemo;

import java.util.Arrays;

/**
 * 归并排序：       hadoop的底层：快速排序+归并排序
 *     针对：针对多个有序的数据集进行排序
 *     前提：需要排序的数据集必须是有序的
 *     多路归并排序（>=2）
 *          两路归并：每次合并数据集是 两个
 *
 *     归：
 *        针对一个数据集进行排序
 *        对这个数据集  拆分成多个有序的数据集
 *              拆分到每个存储一个
 *
 *     并：    两个有序数组的排序
 *        准备两个有序数组
 *        创建一个新数组  长度=两个数组的长度和
 *        遍历两个旧数组  比较后  放入旧数组中
 *
 *
 *
 */
public class _07MergeSort {
    public static void main(String[] args) {
        //测试并步骤
        int[] arr1 = {2,3,4,6,9};
        int[] arr2 = {1,3,5,8,10};
        int[] res = bingSort(arr1,arr2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] bingSort(int[] arr1,int[] arr2){
        //新生成数组
        int[] newarr = new int[arr1.length + arr2.length];
        //定义三个下标  两个旧下标 一个新下标
        int index_arr=0,index_arr1=0,index_arr2=0;

        //有一个数组为空停止循环
        while(index_arr1 < arr1.length && index_arr2 < arr2.length){
            //进行判断，放入新数组中
            //arr1中元素小于 arr2中元素
            if(arr1[index_arr1] < arr2[index_arr2]){
                newarr[index_arr++] = arr1[index_arr1++];
            }else{
                newarr[index_arr++] = arr2[index_arr2++];
            }
        }
        //剩余   arr1剩余
        for (int i = index_arr1; i < arr1.length; i++) {
            newarr[index_arr++] = arr1[i];
        }
        //剩余   arr2剩余
        while(index_arr2 < arr2.length){
            newarr[index_arr++] = arr2[index_arr2++];
        }

        return newarr;
    }
}

