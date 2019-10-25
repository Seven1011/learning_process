package day08.demo07_HashSet存储自定义元素;

public class Dog {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
