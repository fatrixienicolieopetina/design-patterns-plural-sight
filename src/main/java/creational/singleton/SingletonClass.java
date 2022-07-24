package creational.singleton;

public class SingletonClass {
	/*
	 * The keyword volatile helps for thread safety. It ensures that the value will
	 * always be fetched from the main memory
	 */
	private static volatile SingletonClass instance = null;

	private SingletonClass() {
		/*
		 * A runtime exception is thrown if reflection is used to instantiate this class
		 */
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to instantiate the class");
		}
	}

	public static SingletonClass getInstance() {
		/*
		 * instantiation happens during the first call on get instance for lazy-loading
		 */
		if (instance == null) {
			// synchronized keyword is also used for thread safety
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}

		return instance;
	}
}
