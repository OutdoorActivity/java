package java8.functionalInterfaces;

public class Racoon {
    String name;
    int age;

    public Racoon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Racoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
