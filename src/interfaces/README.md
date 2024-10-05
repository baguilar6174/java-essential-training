# Interfaces

- Is similar to an abstract class
- A stateless construct consisting of abstracts behaviors to be implemented by other class.
- Interfaces are meant to be purely abstract and therefore don't have state
- Don't have constructors
- Fields are final (The values of their fields cannot be changed)
- Must be implemented by other classes, not extended
- Any field defined within an interface must be constant (meaning it's static and final)
  * **Static**: can be accessed from any other class without an object instantiation
  * **final**: value assigned at initialization and cannot be changed
  * By convention, constant are written in all caps
- Any class that implements an interface must implement all of its methods, or it must declare itself abstract

```java
public interface Product {
    // By default, methods in an interface are public ans abstract
    String getName();
    void setName(String name);
}
```

Classes can implement multiple interfaces to achieve multiple inheritance.

```java
public class ElectronicBook implements Product, DigitalFile {
    // implement all abstract methods from Product
    // implement all abstract methods from DigitalFile
}
```