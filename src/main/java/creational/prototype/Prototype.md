Prototype Pattern
Concepts:
	- avoid costly operation
	- avoids subclassing
	- Typically does not use the keyword new
	- often utilizes an interface
	- usually implemented with some sort of registry
	- Example is Java.lang.Object.clone method
Design:
	- The interface or class usually implements the clone or deepCopy method of the Clone/Cloneable interface.
	- One usage can be constructing of SQL statements where only parameters vary