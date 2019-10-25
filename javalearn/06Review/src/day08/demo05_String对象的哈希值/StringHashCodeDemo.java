package day08.demo05_String对象的哈希值;

public class StringHashCodeDemo {
    public static void main(String[] args) {
        String s1 = new String("abc");//0x111
        String s2 = new String("abc");//0x222
        String s3 = "abc";
        System.out.println(s3.hashCode());

        //System.out.println(s1==s2);//== 比较的就是真正的地址值,false

        //System.out.println(s1.hashCode()==s2.hashCode());//true

        //System.out.println(s1.equals(s2));//true,比较内容
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        int h1 = "重地".hashCode();
        int h2 = "通话".hashCode();

        System.out.println(h1);
        System.out.println(h2);

        int h3 = "acD".hashCode();
        System.out.println(h3);
    }
}
