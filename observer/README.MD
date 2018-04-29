# Observer pattern

### The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

# The Observer pattern addresses the following problems:
 * A one-to-many dependency between objects should be defined without making the objects tightly coupled.
 * It should be ensured that when one object changes state an open-ended number of dependent objects are updated automatically.
 * It should be possible that one object can notify an open-ended number of other objects.

# What solution does the Observer design pattern describe?
 * Define Observable and Observer objects
 * so that when a subject changes state, all registered observers are notified and updated automatically.
