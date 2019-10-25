package demo02.Set;/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;

public class Demo2LinkedAndList {
    public static void main(String[] args) {
        show03();
    }

    private static void show03() {
        //创建Linklist集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);//[a, b, c, d]

        //- public E removeFirst():移除并返回此列表的第一个元素。
        //- public E removeLast():移除并返回此列表的最后一个元素。
        //- public E pop():从此列表所表示的堆栈处弹出一个元素。
        String first = linked.removeFirst();
        System.out.println(first);//a

        String last = linked.removeLast();
        System.out.println(last);//d

    }

    private static void show02() {

        /*
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
        */

        //创建Linklist集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");

        //  linked.clear();

        //- public boolean isEmpty()：如果列表不包含元素，则返回true。
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println(first);//a
            String last = linked.getLast();
            System.out.println(last);//d
        }
    }

    private static void show01() {
        //创建Linklist集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
            /*
                    - public void addFirst(E e):将指定元素插入此列表的开头。
                    - public void addLast(E e):将指定元素添加到此列表的结尾。
                    - public void push(E e):将元素推入此列表所表示的堆栈。
              */
        //  - public void addFirst(E e):将指定元素插入此列表的开头。
        //  - public void push(E e):将元素推入此列表所表示的堆栈

        // linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);//[www, a, b, c, d]

        //   - public void addLast(E e):将指定元素添加到此列表的结尾。
        linked.addLast("com");
        System.out.println(linked);//[www, a, b, c, d, com]

    }
}
