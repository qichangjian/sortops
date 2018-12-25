package com.qcj.compare;

import java.util.Comparator;

/**
 * Student2外部比较器Comparator 实现compare
*/
public class MyCom implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getAge() - o2.getAge();
    }
}
