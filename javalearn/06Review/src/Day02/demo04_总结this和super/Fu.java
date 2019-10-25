package Day02.demo04_总结this和super;

public class Fu {
    int age;

    public Fu() {
        System.out.println("父类无参的构造方法");
    }

    public Fu(int age) {
        System.out.println("父类的age构造方法");
        this.age = age;

    }
}
