package demo02.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class Demo08EnumSet {
    public static void main(String[] args) {
        //创建一个EnumSet集合，几何元素就是Season枚举类的全部枚举值
        EnumSet es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);//[SPRING, SUMMER, FALL, WINTER]
        //创建一个EnumSet空集合，指定集合元素是Season类的枚举值
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);//输出[]
        //手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);//输出[SPRING, WINTER]
        //以指定枚举值创建EnumSet集合
        EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);//输出[SUMMER, WINTER]
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);//输出[SUMMER, FALL, WINTER]
        //新创建的EnumSet几何元素和es4几何元素有相同的类型
        //es5几何元素+es4集合元素=Season枚举类的全部枚举值
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);//[SPRING]

    }
}
