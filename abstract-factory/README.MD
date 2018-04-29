#Abstract factory pattern\

### Provide an interface for creating families of related or dependent objects without specifying their concrete classes

### Description
The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface

#The Abstract Factory design pattern solves problems like:
 *How can an application be independent of how its objects are created?
 *How can a class be independent of how the objects it requires are created?
 *How can families of related or dependent objects be created?

#The Abstract Factory design pattern describes how to solve such problems:
 *Encapsulate object creation in a separate (factory) object. That is, define an interface (AbstractFactory) for creating objects, and implement the interface.
 *A class delegates object creation to a factory object instead of creating objects directly.

#advantages:
  *Allows you to hide implementation of an application seam (the core interfaces that make up your application)
  *Allows you to easily test the seam of an application (that is to mock/stub) certain parts of your application so you can build and test the other parts
  *Allows you to change the design of your application more readily, this is known as loose coupling.

#disadvantages:
  *Makes code more difficult to read as all of your code is behind an abstraction that may in turn hide abstractions.
  *Can be classed as an anti-pattern when it is incorrectly used, for example some people use it to wire up a whole application when using an IOC container, instead use Dependency Injection.