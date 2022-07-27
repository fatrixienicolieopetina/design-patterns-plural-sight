Decorator Pattern
Concepts
	- Also called a wrapper
	- Add behavior without affecting other
	- More than just simple inheritance
	- Follows the Single-Responsibility Principle
	- Compose behavior dynamically
	- Example in the Java API is the java.io.InputStream class
Design Considerations
	- Inheritance-based
	- Utilizes composition and inheritance 
	- ALternative to subclassing
	- Constructor requires inheritance from the hierarchy
Pitfalls
	- New class for every feature added
	- Multiple little objects
	- Often confused with simple inheritance