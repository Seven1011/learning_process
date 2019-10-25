package demo02.Set;/*
        Set集合的特点：
            1、不允许存储重复的元素
            2、没有索引，没有带索引的方法，也不能适用普通的for循环遍历


        HashSet的特点：
             1、不允许存储重复的元素
             2、没有索引，没有带索引的方法，也不能适用普通的for循环遍历
             3、底层是一个无序的集合，存储元素和去除元素的顺序有可能不一致
             4、底层是一个哈希表结构（查询的速度非常的快）

*/

import java.util.HashSet;

public class Demo3Set {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Integer> hashSet = new HashSet<>();
        //使用add方法往集合中添加元素
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
    }
}
