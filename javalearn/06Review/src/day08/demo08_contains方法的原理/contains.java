package day08.demo08_contains方法的原理;
/*
    1、哈希表结构：HashSet，LinkHashSet
                判断元素重复不重复的原理
                1.1  比较哈希值
                1.2  调用equals方法
                只有  哈希值相同  并且equals方法true，才是重复元素，才不存储

     2、contains方法，判断是否包含某一个元素
                ArrayList的contains方法：
                                names.contains("abc");//判断 names集合中是否包含"abc"
                                只比较   equals的返回值，如果某一个元素和要判断的元素equals方法true，那么就是包含该元素

               HashSet的contains方法：原理和add方法
                                    set.contains("abc")
                                    先判断哈希值
                                    再使用equals方法
                                    只有旧元素和判断的元素的哈希值相同  并且 equals方法  true  才判定包含

*/

public class contains {
    public static void main(String[] args) {

    }
}
