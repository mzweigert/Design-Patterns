#Builder pattern
The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so the same construction process can create different representations.

### advantages
 * Allows you to vary a product’s internal representation.
 * Encapsulates code for construction and representation.
 * Provides control over steps of construction process.

### disadvantages
 * Data members of class aren't guaranteed to be initialized.
 * Requires creating a separate ConcreteBuilder for each different type of product.
 * Requires the builder classes to be mutable.
 * Dependency injection may be less supported.
