# Abstraction

- Structures that represent abstract ideas
- In Java we have the reserved word `abstract`
- Abstract classes and methods are excellent for setting standards and expectations for the implementation or related concepts.

**abstract**: non access modifier that can be used on classes and methods. It is used when you want to define a template for a class or a method, but don't intend fot it to be used as is.

```java
public abstract class Shape {}
```

An abstract class is not designed to be instantiated, it's designed to be extended, thus pushing the burden of implementation onto the subclass. Also you can use an abstract class as a type.

```java
// Any class that contains an abstract method must be abstract itself
public abstract class Shape {
    
    /*
     * only the signature of the method is defined
     * it's designed to be overridden by a subclass*/
    abstract double calculateArea();
}
```
