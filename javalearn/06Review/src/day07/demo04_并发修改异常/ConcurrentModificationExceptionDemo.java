package day07.demo04_并发修改异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
      使用Iterator对象或者增强for循环遍历集合,
      如果出现”itcast”字符串,
      那么向集合中添加一个大写的”ITCAST”字符串

      此问题引发了一个异常:
      Concurrent(并发)Modification(修改)Exception
      java规定,如果一个集合使用迭代器遍历,那么在遍历的过程中 不允许修改集合的长度(增加或者删除)
 *
 */
public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        //1、定义一个集合
        Collection<String> its = new ArrayList<String>();
        its.add("alibaba");
        its.add("tencent");
        its.add("itcast");
        its.add("baidu");
        its.add("sohu");
        its.add("netease");
        //2、使用迭代器遍历吉和
        //2.1   获取集合的迭代器对象
        Iterator<String> it = its.iterator();
        //2.2 循环遍历
        while (it.hasNext()) {
            String itname = it.next();
            //如果相等，添加一个大写"ITCAST"
            its.add("ITCAST");
        }
    }
}
