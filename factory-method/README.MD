# Factory method pattern

### factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.
* avoid subclasses of an object creator in the client application, like the factory method pattern does.
* avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.

### The Factory Method design pattern solves problems like:
 * How can an object be created so that subclasses can redefine which class to instantiate?
 * How can a class defer instantiation to subclasses?

### The Factory Method design pattern describes how to solve such problems:
 * Define a separate operation (factory method) for creating an object.
 * Create an object by calling a factory method.
