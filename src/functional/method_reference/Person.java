package functional.method_reference;

public class Person {

    String name;
    Double height;

    public Person() {}

    public Person(String name, Double height) {
        this.name = name;
        this.height = height;
    }

    public void hello() {
        System.out.println("Hi, my name is: "+ this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
