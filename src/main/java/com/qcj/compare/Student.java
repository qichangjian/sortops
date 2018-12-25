package com.qcj.compare;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
泛型代表比较的对象
 同种类型的对象才具有比较能力

 内部比较器：Comparable<Student>实现comapreTo方法
 */
@Data
@AllArgsConstructor
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    /**
     * @return 返回值的的三种类型
     *  >0  本对象往后窜（移动）
     *  <0  位置不变
     *  =0  本对象往前窜（移动）
     *
     * @param o  参数：用于比较的对象
     *    和本对象（this）比较
     */
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;//升序
    }
}
