# Inheritance

Is where one class becomes an extension of another class. There are two parties involved in poo.polymorphism.inheritance:

Parent (super, parent or base) class and Child (sub, child or derived) class

## Constructors

- A superclass's constructor is run before the subclass's constructor
- An explicit call can be made to the superclass's constructor from one of the subclass's constructors by using `super()`
- An explicit call to the superclass's constructor must be the first statement in the subclass's constructor
- If the superclass does not have a default constructor, the subclass must explicitly call one of its other constructors

## Overriding and Overloading

- **Overriding**: Changing the behavior of an inherit method
- **Overloading**: Methods within the same hierarchy that have the same name but different signatures
- To override a method, you keep the same signature but change the body of the method (use `@Override` decorator)
- To overload a method, you keep the same name but change the signature of the method

## Access limitations

- **Constructors** are not technically members of a class and are therefore not inherited.
- All **public** and **protected** methods and fields in a superclass are inherited by its subclasses.
- Private methods and fields are not inherited.
- Final methods are inherited but cannot be overridden.

## Sealed classes

- Restrict which other classes may extend them.
- Are useful for modeling an specific domain and control the relationship between classes
- Control who can inherit from it

```java
public sealed class Shape permits Rectangle, Circle {}
```

- If a sealed class list the sub-class in the permits clause, the subclass is required

```java
public class Circle extends Shape {}
public class Rectangle extends Shape {}
```

- Children of sealed classes are also required to declare themselves as sealed, non-sealed, or final

```java
public sealed class Rectangle extends Shape permits Squeare {}
```

- **non-sealed** means that the class is open to be extended by any another class.

```java
// Any class that extends circle is not obligated to define themselves as sealed, non-sealed or final
public non-sealed class Circle extends Shape {}
```

- **final** means that the class cannot have any subclasses (it cannot be inherited from)

```java
// Squeare would be the last of the descendants from this hierarchy
public final class Square extends Rectangle {}
```