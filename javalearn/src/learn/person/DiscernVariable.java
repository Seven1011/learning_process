package learn.person;

public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class Inclass {
        private String prop = "内部类的实例变量";

        public void info() {
            String prop = "局部变量";
            //通过外部类类名.this.varName 访问外部类实例变量
            System.out.println("外部类的实例变量值：" + DiscernVariable.this.prop);
            //通过 this.varName 访问内部类实例的变量
            System.out.println("内部类的实例变量值：" + this.prop);
        }
    }

    public void test() {
        Inclass in = new Inclass();
        in.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}
