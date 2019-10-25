

/*
        HashMap存储自定义类型键值
        Map集合保证key是唯一的：
            作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一


*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03HashMap {
    public static void main(String[] args) {
        show02();
    }

    /*
    HashMap存储自定义类型键值
    key:person类型
            person类型必须重写hashCode方法和equals方法，以保证key唯一
    value:String类型
            可以重复（同名同年量的人视为同一个人）

    */

    private static void show02() {
        //创建HashMap集合
        HashMap<person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new person("女王", 18), "英国");
        map.put(new person("秦始皇", 18), "秦国");
        map.put(new person("普京", 30), "俄罗斯");
        map.put(new person("女王", 18), "毛里求斯");

        Set<Map.Entry<person, String>> set = map.entrySet();
        for (Map.Entry<person, String> entry : set) {
            person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }

    /*
    HashMap存储自定义类型键值
    key:String类型
            String类重写hashCode方法和equals方法，可以保证key唯一
    value:Person类型
            value可以重复（同名同年量的人视为同一个人）


    */

    private static void show01() {
        //创建HashMap集合
        HashMap<String, person> map = new HashMap<>();
        //往集合中添加元素
        map.put("北京", new person("张三", 18));
        map.put("上海", new person("李四", 19));
        map.put("广州", new person("王五", 20));
        map.put("北京", new person("赵六", 18));
        //使用keySet增强for遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            person value = map.get(key);
            System.out.println(key + "-->" + value);

        }
    }
}
