package mainPack;

public class MainClass {
	
	static {
		System.out.println("hello static");
		staticMethod();
	}
	
	
	static void staticMethod() {
		System.out.println("this is static method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world ");
	}

}
