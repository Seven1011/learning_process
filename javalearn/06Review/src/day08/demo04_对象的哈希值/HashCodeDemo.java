package day08.demo04_对象的哈希值;

/*
 * 对象的哈希值:
 * 		任何对象,都有一个哈希值,哈希值是对象的一个数字表示
 * 		对象的字符串表示,toString方法,默认表示格式:包名.类名@地址值
 *
 * 1.如果获取对象的哈希值?
 * 		每一个对象都有一个方法,hashCode方法,这方法定义在了Object类中,所以每个对象都具有
 *
 * 2.我们以前说的地址值,实际上根本不是地址值,而是哈希值的16进制
 *
 *
 * 3.在java中怎么看真正地址值? 看不了
 *
 *
 * 4.哈希值的由来
 * 		是由真正的地址值计算的,通过一种散列算法(哈希算法)
 * 		所以 一般来说 地址值 不一样, 哈希值也是不一样的
 *
 *
 * 5.不可逆算法(MD5,WPA2)
 *
 * 6.碰撞算法(一个一个式)
 *
 * 7.暴力破解&字典破解(破解wifi教程)
 *

 */
public class HashCodeDemo {
    public static void main(String[] args) {
        Person pp = new Person();
        Person pp1 = new Person();
        int hc = pp.hashCode();
        System.out.println(hc);

        int hc1 = pp1.hashCode();
        System.out.println(hc1);
        System.out.println(pp.toString());
    }
}
