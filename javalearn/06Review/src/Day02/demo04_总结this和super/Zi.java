package Day02.demo04_总结this和super;

public class Zi extends Fu {
    String name;
    int id;

    //全参的构造方法

    public Zi(int age, String name, int id) {
        super(age);
        this.name = name;
        this.id = id;
    }

    public Zi(String name) {
        super();
        this.name = name;
    }

    public Zi() {
        super();
    }
}
