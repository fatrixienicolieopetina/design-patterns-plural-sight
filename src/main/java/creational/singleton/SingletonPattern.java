package creational.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		/*
		 * A singleton should be used to guarantee one instance of a class. It is easy
		 * to implement.
		 * 
		 * Common pitfalls of a singleton pattern include 
		 * - often over-used 
		 * - difficult to unit test 
		 * - if not careful, is not thread safe
		 */
		var singletonClass = SingletonClass.getInstance();
		System.out.print(singletonClass);
	}

}
