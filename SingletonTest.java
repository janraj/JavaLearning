public class SingletonTest{
	private static SingletonTest instance;
	private SingletonTest() {
                System.out.println("Initializing the object");
	}
	public static synchronized SingletonTest getInstance(){
		if (instance == null){
			instance = new SingletonTest();
		}
		return instance;
	}
	public static void main(String[] args){
		SingletonTest obj = SingletonTest.getInstance();
				
	}
}
