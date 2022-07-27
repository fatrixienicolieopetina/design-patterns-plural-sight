Adapter Pattern
Concepts
	- Convert interface into another interface
	- Used when legacy app cannot be changed
	- Client, Adapter, Adaptee
	- Examples in the Java API include the collections api Arrays -> List, Streams
	- Retrofitted : make unrelated classes work together
Design Considerations
	- client-centric
	- integrate new with old (typical usage)
	- can be implemented using an interface, but not required
	- adaptee can be the implementation, usually the new code written
Pitfalls
	- Dont overcomplicate
	- Should not add functionality to the adapter class