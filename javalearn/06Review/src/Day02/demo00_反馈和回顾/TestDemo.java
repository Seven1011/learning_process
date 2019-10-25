package Day02.demo00_反馈和回顾;

/*
 * 类名作为方法的参数
 * 	 案例:杀人
 * 	总结:在调用方法时,我们需要传递的是 该类的对象,不是别类的对象也不是该类
 *
 *
 *
 * 类名作为方法的返回值:
 * 		案例:生孩子
 * 		实际上需要返回的是 该类的对象  不是该类,也不是别的类的对象
 *
 *
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        //调用
        Person p = new Person();
        p.name = "张三";
        p.age = 19;
        killPerson(p);

        Person p2 = newBaby();
        System.out.println(p2.age + "....." + p2.name);

    }

    //生孩子
    private static Person newBaby() {
        //返回一个孩子对象
        Person pp = new Person();
        pp.age = 3;
        pp.name = "哪吒";

        //返回这个孩子
        return pp;
    }

    private static void killPerson(Person person) {
        System.out.println("杀死了" + person.age + "岁的" + person.name);
    }
}
