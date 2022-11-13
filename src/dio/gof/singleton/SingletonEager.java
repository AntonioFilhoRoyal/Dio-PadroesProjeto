package dio.gof.singleton;

public class SingletonEager {
	private static SingletonEager eager;
	
	private SingletonEager() {
		super();
	}
	
	
	public static SingletonEager getEager() {
		eager = new SingletonEager();
		return eager;
	}
}


