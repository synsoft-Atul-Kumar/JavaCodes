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
	
	
	public static void main(String[] args) {
		
		System.out.println(new MainClass().x);
		
		
	}
}
