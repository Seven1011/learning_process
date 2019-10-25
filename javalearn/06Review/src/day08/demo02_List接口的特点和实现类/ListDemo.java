package day08.demo02_List接口的特点和实现类;
/*
        List接口的特点:
 * 		a.有下标
 * 		b.有序的(有序不是自然顺序,不是123,abc,有序指的是存和取的顺序一致)
 * 		c.可重复
 * 		实现类:ArrayList,LinkedList,Vector
 * 		ArrayList:底层采用数组结构,查询快,增删慢
 * 		LinkedList:底层采用链表结构,查询慢,增删快
 * 		Vector:底层采用数组结构,查询快,增删慢
 * 		List结构中具有的方法:
 * 		增: add(E e);add(int index,E e);
 * 		删: remove(Object obj);remove(int index);
 * 		改: set(int index,E e);
 * 		查: get(int index);
 * 		其他:
 * 			size(),clear(),contains(Object obj),toArray()
 * 			iterator();isEmpty()
 *
 * 		实现类的方法:
 * 		1.ArrayList:方法基本和List中定义的一模一样
 * 		2.LinkedList:除了和List接口中一样的方法之外
 * 			LinkedList提供了大量首位操作的方法
 * 			第一组:
 * 			void addFirst(E e);
 * 			void addLast(E e);
 * 			第二组:
 * 			E removeFirst();//删除首个元素,返回被删除的元素
 * 			E removeLast();//删除尾部元素,返回被删除的元素
 * 			第三组:
 * 			E getFirst();
 * 			E getLast();
 * 			第四组:
 * 			E pop();//弹出,删除集合中的某一个元素,和 removeFirst功能是一样的
 * 			void push(E e);//推入,把一个元素添加到集合中, 和addFist功能是一样的
 *



*/

public class ListDemo {
    public static void main(String[] args) {
        //1、测试LikedList中四组特有的方法
    }

}
