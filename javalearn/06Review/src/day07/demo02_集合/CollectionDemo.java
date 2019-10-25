package day07.demo02_集合;
/*
    Collection<E>根接口中定义的方法：这些方法，所有集合类都具有

    增：添加方法
                boolean add(E   e); //添加一个元素，返回值表示是否添加成功

     删：删除方法
                   Boolean remove(Object  obj); //删除某一个元素，返回值表示是否删除成功

     改：修改元素
                    无
     查：获取某一个元素
                    无
      其他：
                int size();//获取长度
                void clear();//删除所有元素
                boolean contains(Object obj);//判断是否包含obj元素
                Object[] toArray();//集合转换成数组



*/

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {
        //1.创建一个集合对象,使用多态
        Collection<String> names = new ArrayList<String>();
        //2.添加
        names.add("郭德纲");
        names.add("刘德华");
        names.add("柳岩");
        names.add("范伟");
        //3.打印
        System.out.println(names);
        //4.删除
//		boolean b = names.remove("郭德纲");
//		System.out.println(b);
//		System.out.println(names);
        //5.获取长度
//		int size = names.size();
//		System.out.println(size);
        //6.清空
//		names.clear();//和 names=null
//		System.out.println(names.size());
        //7.判断是否包含
	/*	boolean b2 = names.contains("柳小岩");
		System.out.println(b2);*/
        //8.转成数组
        Object[] objs = names.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
        }

    }

}
