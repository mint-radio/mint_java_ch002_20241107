package ch06_04;

public class SingletonTest {
	
	private static SingletonTest singleton = new SingletonTest();
	
	private SingletonTest() {
		
	}
	
	static SingletonTest getInstance() {
		if (singleton == null) {
			singleton = new SingletonTest();
		}
		return singleton;
	}

}
