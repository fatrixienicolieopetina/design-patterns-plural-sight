Builder Pattern : programming problem on what constructor to use
	Concepts:
		- Handles complex constructors
		- Large number of parameters
		- Immutability
		- Examples: StringBuilder, DocumentBuilder, LocaleBuilder
	Design Considerations:
		- flexibility over telescoping constructors
		- usually created with a static inner class
		- negates the need for exposed setters