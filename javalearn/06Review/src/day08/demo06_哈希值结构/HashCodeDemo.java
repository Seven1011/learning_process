package day08.demo06_哈希值结构;
/*
 * 哈希表结构:
 * 		数组结构+链表结构的组合,查询快,增删快
 *
 * HashSet:采用了哈希表结构
 *
 * LinkedHashSet:采用了链表+哈希表结构
 *
 * Set集合中有三个特点:
 * 		1.无下标 2.无序(LinkedHashSet和TreeSet除外) 3.不能重复
 *
 * 哈希表结构,判断元素是否重复的原理:
 *
 * 1.先判断 新元素的哈希值 和 所有旧元素的哈希值是否相同
 * 		如果都不相同,直接判断不重复,添加
 *
 * 2.再调用  新元素 和  哈希值相同的旧元素的equals方法
 * 		如果返回是true 判定重复元素 ,不添加
 * 		如果返回是false 判定不重复,添加
 *
 * 总结:
 * 		只有哈希值相同,并且equals返回true,才判定重复
 *
 *
 *
 */

import java.util.HashSet;

public class HashCodeDemo {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<String>();
        s.add("java");
        s.add("abc");
        s.add("php");
        s.add("abc");
        s.add("acD");
        s.add("重地");
        s.add("通话");
        s.add("javaee");

        System.out.println(s);
    }
}
