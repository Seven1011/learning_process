package day07.demo07_泛型中E的含义;

/*
    泛型中E的含义：
                是一个“变量”，用来接收一种数据类型
     泛型可以用在雷伤，方法上，接口上

     1、泛型用在类上：泛型类
                格式：public class  类名<E>
                泛型类上的泛型E 到底什么时候确定？
                        当你创建该类的对象的时候就可以确定

      2、泛型用在方法上：泛型方法
                格式：public  interface 接口名<E>
                泛型方法上的泛型到底什么时候确定？
                  当你调用方法，传递参数的时候确定

      3、泛型用在接口上：泛型接口
                  格式：
                    public interface 接口名<E>
                    泛型接口上的泛型，什么时候可以确定？
                        1、实现类实现接口的时候，直接确定
                        2、实现类实现接口的时候，不确定泛型，而是直接把泛型继承下来
                                当这个实现类创建 对象的时候确定

*/
public class GenericDemo {

    public static void main(String[] args) {
        //1.创建一个Person
//		Person p = new Person();
//		p.setAaa("123");
        //2.创建一个Person<E>
		/*Person<String> pp = new Person<String>();
		pp.setAaa("小明");
		String aaa = pp.getAaa();*/
		/*Person<Integer> pp = new Person<Integer>();
		pp.setAaa(123);
		Integer aaa = pp.getAaa();*/
        //3.使用泛型方法
		/*Person<String> pp = new Person<String>();
		pp.show("abcd");*/

    }
}
