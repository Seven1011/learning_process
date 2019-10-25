package demo02.Set;

import java.util.ArrayList;
import java.util.List;

public class Demo9ListTest {
    public static void main(String[] args) {
        List book = new ArrayList<>();
        //向book集合中添加4个元素
        book.add(new String("轻量级Java  EE企业应用实战"));
        book.add(new String("疯狂Java讲义"));
        book.add(new String("疯狂Android讲义"));
        book.add(new String("疯狂ios讲义"));
        //使用目标类型为Comparator的Lambda表达式对List集合排序
        book.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(book);
        //使用目标类型为UnaryOperator的Lambda表达式来替换集合中所有元素
        //使用Lambda表达式控制使用每个字符的长度作为新的集合元素
        book.replaceAll(ele -> ((String) ele).length());

    }
}
