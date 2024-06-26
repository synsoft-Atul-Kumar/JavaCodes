package mainPack;
/**
 * This class is for demonstration of non-static members (non-static block ,constructor, non-static variable
 * @author atulkumar
 * @version 1.0.0
 * @since 26-06-2024
 * 
 */
public class MainClass {

	int x;
	
	/**
	 * constructor of MainClass
	 */
	MainClass(){
		System.out.println("constructor from main class");
		 x=99;
	}
	
	{
		System.out.println("this is non static block");
	}
	
	static {
		System.out.println("this is static block");
	}
	
	public static void main(String[] args) {
		System.out.println();
		
		System.out.println(new MainClass().x);
		System.out.println();
		System.out.println(new MainClass().x);

		
		
	}
}
