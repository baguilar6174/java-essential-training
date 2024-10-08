# Collections

Data structures that hold a group of objects (elements)
 
**Elements within a collection**

- Unique vs. duplication
- Ordered vs. unordered
- Java provides a collection framework (unified architecture that provides data structures and algorithms to manipulate them)
- All the interfaces and classes for the collection framework can be found in the `java.util` package

The most common ones are:

- `set`: Collection of unordered unique elements
- `list`: Collection of ordered elements tht can be accessed by position (can contain duplicated elements)
- `queue`: Collection of ordered elements that are processed in the order they were added (FIFO: first in, first out)
- `map`: collection of unordered unique key-value pairs

**java.util.Collections**

A class that contains algorithms for working with collections. Common algorithms are:

- binarySearch
- copy
- frequency
- reverse
- shuffle
- sort

**iterators**

- A common task is to loop through the elements of a collection. One way to do this is with iterators.
- The collection interface provides iterators.
- The iterator method is provided by the collection interface. And it is available on all collections that inherit from collection.
- `Map` does not inherit from the collection interface (does not have iterator method)