package com.qcj.sortdemo;

/**
 * 插入排序
 * 算法分析：
 *      插入排序最好的情况是序列已经是升序排列了，在这种情况下，需要进行 N-1 次比较即可，时间复杂度为 O(N)，
 *      最坏的情况是序列降序排列，这时候时间复杂度为 O(N^2)。因此插入排序不适合对于数据量比较大的排序应用。
 *      但是如果需要排序的数据量很小(如小于千)，那么插入排序还是一个不错的选择。
 *      插入排序平均时间复杂度为 O(N^2)，但是它要比冒泡排序快一倍，比选择排序还要快一点，经常被用在较复杂的排序算法的最后阶段，例如快速排序。
 * 算法是稳定的，假设 a=b，且 a 在 b 的前面，其排序位置必然比 b 先确定，而后面再插入 b 时，必然在 a 的后面，所以是稳定的。
 * 空间复杂度为 O(1)，不需要额外的空间。
 */
public class _03InsertExample {
    public static void main(String[] args) {
        //插入排序
        int[] source = {4,2,3,1,7,9};
        InsertSort(source);
    }

    /**
     *插入排序的实现步骤为：
     *      从第一个元素开始，该元素可以认为已经被排序 ->
     *      取出下一个元素，在已经排序的元素序列中从后向前扫描 ->
     *      如果该元素小于前一个元素，则将两者调换，再与前一个元素比较–>
     *      重复第三步，直到找到已排序的元素小于或者等于新元素的位置 ->
     *      将新元素插入到该位置中 ->
     *      重复第二步
     *
     * 总结：取出一个元素作为一个数组，向该数组插入排序,比前面一个小，交换，再小，再交换
     */
    private static void InsertSort(int[] source) {
        int temp;
        for (int i = 1; i < source.length; i++) {
            for (int j = i; (j > 0) && (source[j]<source[j-1]) ; j--) {
                temp = source[j];
                source[j] = source[j-1];
                source[j-1] = temp;
            }
        }
        PrintUtil.printlnArray(source);
    }
}
