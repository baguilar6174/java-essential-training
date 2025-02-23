package functional.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Static method reference
        Function<Integer, String> converter = String::valueOf;
        System.out.println(converter.apply(5));

        // Reference to an instance method of an object
        Person person = new Person();
        person.name = "Bryan";
        Runnable hello = person::hello;
        hello.run();

        // Reference to a constructor
        BiFunction<String, Double, Person> createPerson = Person::new;
        Person person2 = createPerson.apply("Alexander", 171.5);
        System.out.println(person2.toString());

        // Reference to an instance method of an arbitrary object
        List<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);
        people.add(new Employee());
        people.add(new Manager());
        people.forEach(Person::hello);
    }
}
