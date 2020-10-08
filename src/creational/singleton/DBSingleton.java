package creational.singleton;

public class DBSingleton {

	// Volatile will assure the JVM to keep the instance a Singleton
	private static volatile DBSingleton instance = null;

	private DBSingleton() {
		// This will prevent a reflection class from creating an instance
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static DBSingleton getInstance() {
		if (instance == null) {
			// This will prevent two threads colliding
			synchronized (DBSingleton.class) {
				if (instance == null)
					instance = new DBSingleton();
			}
		}
		return instance;
	}

}
