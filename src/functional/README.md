# Functional programming

## Anonymous classes

- It's a class that is defined and used at the same time, without giving it a name. 
- Used when you need a class that you are only going to use once, such as to override methods of a class or interface, without having to create a complete class.

```java
interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            @override
            public void greet() {
                System.out.println("Hello");
            }
        };
        greet.greet();
    }
}
```

## Lambda expressions

- It's a short way to write functions or blocks of code that you can pass as parameters to methods or use within collections. 
- It's a way to represent a function or procedure without having to write the entire structure of a method. 
- Integrated since JDK 8, to incorporate functional programming.
- They are also known as ***anonymous functions***, and basically implement methods without the need of a class.
- To use lambda expressions you need to implement ***functional interfaces***

## Functional interfaces

- A functional interface is one that has exactly one abstract method. 
- In order to make use of lambda expressions, we must also make use of functional interfaces. 
- Lambda expressions are used to implement the single abstract method of the functional interface in a concise manner. 
- Java has many predefined functional interfaces in the `java.util.function` package.

```java
@FunctionalInterface
public interface Runnable {
    void run();
}
```

- You can create your own functional interfaces
- Make sure that the interface contains exactly one abstract method. 
- The `@FunctionalInterface` annotation is optional, but it is good practice to use it.
- Lambda expressions are used to implement the single abstract method of the functional interface in a concise way.

> "If we have more than one method, complex logic or we need use inheritance, we must use anonymous classes. If we have only one method, we can use lambda functions."
