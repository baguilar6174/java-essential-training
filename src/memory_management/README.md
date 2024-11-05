# Java Memory Management

Computer memory mechanism resemble the Java memory mechanism. 

- Java memory is responsible for storing the data the App needs in order to run.
- Java memory is managed by JVM
- Are stored in each Java memory
  - Instances 
  - Primitive values
  - Constants
  - Fields and method data
  - Method codes
  - Native methods
  - Order of execution

## The importance of understanding java memory

- It's easier to visualize what's going on with object composition.
- It's easier to understand the steps to take to get to data when you understand how Java memory works
- `this` and `static`
- References: pass by value and pass by reference
- References: immutable vs mutable objects
- Concurrency
- Garbage collection

## JVM and memory management

- JMV manages Java memory
- Memory allocation
- Memory deallocation (without deallocation memory would get full)
- Program will run out of memory
- When JVM starts, it's reserves a piece of RAM memory for the Java App (HEAP memory)
- JVM is actually managing different types of memory (class area, Heap, Stack, Program counter register, native method stack memory)
- Deallocation of the Heap managed by the garbage collection process of the JVM

## Stack Memory

- Used for executing methods
- Contains primitives and object references of methods in the stack (the primitive values are stored directly in the stack)
- Objects itself are stored an the heap.
- Different blocks for every method
- When the method is done, the block gets removed

## Heap Memory

- Holds all the objects that exist in the App
- Objects on the Heap can be accessible from everywhere in the app using the address of the object (reference)
- Objects on the Heap contain primitive values and references to other objects on the Heap

## Stack vs Heap

| stack                                 | heap                                                    |
|---------------------------------------|---------------------------------------------------------|
| Only references and primitive values  | Objects(which contains references and primitive values) |
| Accessed LIFO                         | Accessible whenever you have the address                |
| Smaller and automatically deallocated | Bigger and deallocated by garbage collector             |
| Faster to access                      | Slower to access                                        |
| Exists if the method is running       | Exists for app lifetime                                 |
| Memory full: StackOverflowError       | Memory full: OutOfMemoryError                           |