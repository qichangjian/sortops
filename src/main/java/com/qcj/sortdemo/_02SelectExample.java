package com.qcj.sortdemo;

/**
 * 选择排序：
 * 算法分析：
 *      选择排序最好和最坏的情况一样运行了 O(N^2) 时间，但是选择排序无疑更快，因为它进行的交换少得多，
 *      当 N 值较小时，特别是如果交换时间比比较时间大得多时，选择排序实际上是相当快的。
 *      平均复杂度也是 O(N^2)。
 * 算法是不稳定的，假设 a=b，且 a 在 b 前面，而某轮循环中最小值在 b 后面，而次最小值需要跟 a 交换，这时候 b 就在 a 前面了，所以选择排序是不稳定的。
 * 空间复杂度为 O(1)，不需要额外的空间。
 */
public class _02SelectExample {
    public static void main(String[] args) {
        //选择排序
        int[] source = {4,2,3,1,7,9};
        SelectSort(source);
    }

    /*
    选择排序改进了冒泡排序，将必要的交换次数从 O(n^2) 减少到 O(n)，但是比较次数仍保持为 O(n^2)。
    冒泡排序每比较一次就可能交换一次，但是选择排序是将一轮比较完后，把最小的放到最前的位置（或者把最大的放到最后）。
    选择排序为大记录量的排序提出了一个非常重要的改进，因为这些大量的记录需要在内存中移动，这就使交换的时间和比较的时间相比起来，交换的时间更为重要。
    （一般在 java 中不是这种情况，因为 java 中只是改变了引用位置，而实际对象的位置并没有发生改变。）
     */
    private static void SelectSort(int[] source) {
        int min;//记录最小值坐标
        int temp;
        for (int i = 0; i < source.length; i++) {
            min = i;
            for (int j = i+1; j < source.length; j++) {
                if(source[j]<source[min]){
                    min = j;
                }
            }
            temp = source[min];//交换i和min位置的数值
            source[min] = source[i];
            source[i] = temp;
        }

        PrintUtil.printlnArray(source);
    }


}
