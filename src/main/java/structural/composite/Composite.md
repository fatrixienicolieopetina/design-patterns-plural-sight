Composite Pattern
Concepts
	- Components represent part or whole structure
	- Compose objects into tree structures
	- Individual object treated as Composite
	- Same operations applied on individual and composites
	- Examples in the Java API is java.awt.Component
Design
	- Tree-structured
	- Component, either leaf or composite
	- Composite knows about child objects
	- Map and other collections in the collections API is an interesting implementation of the composite pattern
	- Composite != Composition
Pitfalls
	- Can overly simplify a system
	- Difficult to restrict
	- Implementation can be costly
	- 