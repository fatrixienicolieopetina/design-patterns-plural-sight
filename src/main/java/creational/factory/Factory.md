Factory Pattern
Concepts
	- Does not expose instantiation logic
	- Defer instantiation to subclasses
	- Common interface
	- Specified by architecture implemented by the user
	- Examples in the java api: Calendar, ResourceBundle, NumberFormat
Design
	- kind of the opposite of singleton
	- factory is responsible for lifecycle
	- common interface, concrete classes, parameterized create method
	
Summary
	- Parameter driven
	- Solves complex creation
	- A little complex
	- Opposite of singleton
	
IMPORTANT: the abstract method is the used in the instantiation or in the constructor