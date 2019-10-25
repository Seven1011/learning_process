package day08.demo07_HashSet存储自定义元素;

import java.util.HashSet;

/*
 * 使用HashSet存储自定义元素(Dog对象)
 *
 *
 * 结论:
 * 		如果我们自定义了类 要使用HashSet存储
 * 		如何保证元素的唯一性:
 * 			必须重写自定义类的两个方法,hashCode和equals
 *
 * 定义一个标准的类:
 * 		1.封装(private+get/set)
 * 		2.构造(无参+全参)
 * 		3.toString(快速打印对象信息)
 * 		4.hashCode和equals(保证元素使用哈希表结构存储时的唯一性)
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //1、创建集合
        HashSet<Dog> dogs = new HashSet<>();
        dogs.add(new Dog(30, "老旺财"));
        dogs.add(new Dog(18, "旺财"));
        dogs.add(new Dog(19, "小旺财"));
        dogs.add(new Dog(20, "中旺财"));
        dogs.add(new Dog(30, "老旺财"));
        //能不能添加到dogs集合
        //需求:如果两个狗的年龄和名字都相同 我们认为是同一个狗,我们不想添加到集合中
        System.out.println(dogs);
    }
}
