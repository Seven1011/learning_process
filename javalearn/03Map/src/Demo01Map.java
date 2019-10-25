
import java.util.HashMap;
import java.util.Map;
/*
        java.util.Map<k,v>集合
            Map集合的特点:
                1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
                2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
                3.Map集合中的元素,key是不允许重复的,value是可以重复的
                4.Map集合中的元素,key和value是一一对应
            java.util.HashMap<k,v>集合 implements Map<k,v>接口
            HashMap集合的特点:
                1.HashMap集合底层是哈希表:查询的速度特别的快
                    JDK1.8之前:数组+单向链表
                    JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
                2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
           java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
           LinkedHashMap的特点:
                1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
                2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的


*/

public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    /*
        boolean containsKey(Object key) 判断集合中是否包含指定的键。
        包含返回true,不包含返回false
     */
    private static void show04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 175);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1);//true

        boolean b2 = map.containsKey("迪丽热巴");
        System.out.println(b2);//false
    }

    /*
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
            返回值:
                key存在,返回对应的value值
                key不存在,返回null
     */
    private static void show03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 175);

        Integer v1 = map.get("赵丽颖");
        System.out.println("v1:" + v1);//v1:168

        Integer v2 = map.get("罗志祥");
        System.out.println("v2:" + v2);//v2:null

    }

    private static void show02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 175);
        System.out.println(map);//{林志玲=175, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println("v1:" + v1);//v1:175

        System.out.println(map);

        //int v2 = map.remove("林志颖");//自动拆箱  NullPointerException
        Integer v2 = map.remove("林志颖");
        System.out.println("v2:" + v2);//v2:null

        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

    private static void show01() {
        //创建map集合
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 冷锋=龙小云}
    }
}
