# Polymorphism

- Is the ability to take multiple forms
- Is where a subclass can define their own unique behavior and yet share some of the same behaviors of their superclass.

```java
// Where an object has a superclass type but is an instance of a subclass
Animal dog = new Dog();
```

**Type vs. Instance**

An object can have a superclass type and a subclass instance

**Overridden methods**

If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime

## Object Type Casting

- The act of converting an object's type into a different type
- Casting can be performed upward or downward in an poo.polymorphism.inheritance tree.

```java
Animal dog = new Dog(); // implicit up cast
```

> In an implicit up cast, the object now only has access to the methods of the class it was created up to.

If we wanted to store a down casted object, we could do so by assigning the cast to an object of that same type.

```java
Animal sasha = new Dog(); // implicit up cast
Dog sashaTheDog = (Dog)sasha;
```

