AbstractFactory
Concepts
	- Factory of factories
	- Factory of related objects
	- Common interface
	- Defer creation logic/instantiation to subclasses
	- Examples in the Java API: Document Builder, XML APIs, etc
Design
	- Group Factories together
	- Factory is responsible for lifecycle
	- Common interface carried out by the common factories, factories under it
	- Parameterized create methods
	- typically built using composition
Pitfalls
	- Complexity
	- Runtime switch : client knows too much
	- Pattern within a pattern
	- Problem-specific
	- Starts off as a factory
Summary
	- Group of similar factories
	- Complex, a lot more so than other creational design patterns
	- Heavy abstraction
	- Framework pattern
	- 