package demo03.hashCode;
/*
    哈希值：是一个十进制的整数，有系统随机给出（就是对象的地址值，是一个逻辑地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int hashCode()  返回该对象的哈希码值。
    hashCode方法的原码：
                public native int hashCode();
                native:代表该方法调用的是本地操作系统的方法

*/

public class Demo01HashCode {
    public static void main(String[] args) {
        person p1 = new person();
        int h1 = p1.hashCode();
        System.out.println(h1);//1163157884

        person p2 = new person();
        int h2 = p2.hashCode();
        System.out.println(h2);//1956725890

        /*
                toString方法的源码：
                                  return getClass().getName() + "@" + Integer.toHexString(hashCode());
                */
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);//false

        /*
        String类的hashCode方法
            String类重写Object类中的hashCode方法
         */
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }
}
