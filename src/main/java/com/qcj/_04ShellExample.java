package com.qcj;

/**
 * 希尔排序
 * https://blog.csdn.net/weixin_37818081/article/details/79202115
 */
public class _04ShellExample {
    public static void main(String[] args) {
        //希尔排序13
        int[] source = {4,2,3,1,7,9,23,14,100,8,0,199,22,55};
        shellSort(source);
    }

    private static void shellSort(int[] source) {
        int h = 1;
        while(h <= source.length/3){
            h = h*3+1;
            System.out.println("H:"+h);
        }

        while(h > 0){
            for (int i = h; i < source.length; i++) {
                System.out.println("I:"+i);
                //每个增量间隔内，实现插入排序，两个for循环和插入排序一样，只不过第二个for循环里参数略有调整而已，和h有关
                for (int j = i; j < source.length; j+=h) {
                    for (int k = j; (k-h) >= 0 && source[k] < source[k-h] ; k-=h) {
                        //交换k,k-h
                        int temp = source[k];
                        source[k] = source[k-h];
                        source[k-h] = temp;
                    }
                }
            }
            h = (h-1)/3;
            System.out.println("h---------------------"+h);
            PrintUtil.printlnArray(source);
        }
        System.out.println("END");
    }
}
