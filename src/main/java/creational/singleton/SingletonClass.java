package creational.singleton;

public class SingletonClass {
	/*
	 * The keyword volatile helps in the thread safety. It ensures that
	 * the value will always be fetched from the main memory
	 */
	private static volatile SingletonClass instance = null;
	
	private SingletonClass() {	
		/*
		 * A runtime exception is thrown if reflection is used 
		 * to instantiate this class
		 */
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to instantiate the class");
		}
	}
	
	public static SingletonClass getInstance() {
		if (instance == null) {
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		
		return instance;
	}
}
