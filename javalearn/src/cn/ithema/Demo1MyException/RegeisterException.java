package cn.ithema.Demo1MyException;

/*
    自定义异常类：
        java提供的异常类不够我们使用，需要自己定义一些异常类
     格式：
        public class XXXException excends Exception | RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
            }
      注意：
        1、自定义异常类一般都是以Exception结尾，说明该类是一个异常类
        2、自定义异常类，必须继承Exceptio或者RuntimeException
            继承Exception：那么自定义的异常类就是一个编译期异常，如果方法内部抛出了编译期异常，就必须除了这个异常，要么throws，要么try...catch
            继承RuntimeException：那么自定义的异常类就是一个运行期异常，无序处理，交给虚拟机处理（中断处理）

 */
public class RegeisterException extends Exception {
    //添加一个空参数的构造方法
    public RegeisterException() {
        super();

    }

    //添加一个带异常信息的构造方法
    //查看源码发现，所有的异常类都会有一个带异常信息的构造方法，方法内部会调用父类带遗产信息的构造方法，让父类来处理异常
    public RegeisterException(String message) {
        super(message);
    }
}
