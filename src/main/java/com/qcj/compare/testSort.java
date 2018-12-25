package com.qcj.compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 比较器的使用
 *    compareable 内部比较器
 *           如果一个类实现了这个接口，代表这个类具备了比较的能力
 *           实现compareTo
 *    comparator 外部比较器
 *          专门定义一个比较器的类，类中去定义比较规则
 *           实现compare
 */
public class testSort {
    public static void main(String[] args) {
        //1.string排序
        /*ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("n");
        list.add("v");
        list.add("b");
        list.add("c");
        System.out.println(list);
        Collections.sort(list);//排序
        System.out.println(list);*/

        //2.内部比较器
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zs1",19));
        list.add(new Student("zs2",29));
        list.add(new Student("zs3",10));
        list.add(new Student("zs4",23));
        list.add(new Student("zs5",8));
        System.out.println(list);
        //只要调用排序的方法，必须具有排序的能力，否则无法编译通过
        //解决方法：实现Comparable接口  ...ble使..具有..能力
        Collections.sort(list);
        System.out.println(list);

        //3.外部比较器
        ArrayList<Student2> list2 = new ArrayList<>();
        list2.add(new Student2("zs1",19));
        list2.add(new Student2("zs2",29));
        list2.add(new Student2("zs3",10));
        list2.add(new Student2("zs4",23));
        list2.add(new Student2("zs5",8));
        System.out.println(list2);
        MyCom myCom = new MyCom();
        Collections.sort(list2,myCom);
        System.out.println(list2);

    }
}
