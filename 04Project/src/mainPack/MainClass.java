package mainPack;

/**
 * @author atulkumar
 * @version 1.0.0
 * 
 *          <h3>*About:</h3>
 *          <p>
 *          This class is for static method demonstration
 *          </p>
 */

public class MainClass {

	/**
	 * This is for demonstration of static method
	 * @param x It will take string
	 */
	static void demoStatic(String x) {
		//this is static method 
		System.out.println("hello this is static method being called from " +x);
	}
	
	/**
	 * this is static block
	 */
	static {
		MainClass.demoStatic("static block");
	}
	
	
	/**
	 * this class is the main class
	 * @param args will not be used here
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass.demoStatic("Main method");

	}

}
