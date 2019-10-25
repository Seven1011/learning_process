package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
        任意的单列集合都可以使用C偶来了餐厅接口中的方法

        共性方法：

* */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了tosSring方法

        /*
            public boolean add(E e):把给定的对象添加到当前集合中
            返回值是一个boolean值，一般都返回true，所以可以不用接收
        * */
        boolean b1 = coll.add("张三");
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

            /*
                public boolean remove(Object o) 删除集合中的指定元素o
              * */
        boolean b2 = coll.remove("赵六");
        System.out.println("b2:" + b2);//返回true

        boolean b3 = coll.remove("赵四");
        System.out.println("b3:" + b3);
        System.out.println(coll);

        boolean b4 = coll.contains("李四");
    }
}
