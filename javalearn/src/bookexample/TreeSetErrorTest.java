package bookexample;

import java.util.TreeSet;

class Z implements Comparable {
    int age;

    public Z(int age) {
        this.age = age;
    }

    //重写equals()方法，返回值总是true
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    //重写compareTo(Object obj)方法，返回值总是1
    public int compareTo(Object obj) {
        return 1;
    }
}

public class TreeSetErrorTest {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        //第二次添加同一个对象，输出true，表明添加成功
        System.out.println(set.add(z1));
        //下面输出set集合，将看到有两个元素
        System.out.println(set);
        //修改set集合的第一个元素的age变量
        ((Z) (set.first())).age = 9;
        //输出set集合的最后一个元素的age变量，将看到也输出了9
        System.out.println(((Z) (set.last())).age);
    }
}
