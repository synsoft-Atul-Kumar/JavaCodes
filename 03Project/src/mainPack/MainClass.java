package mainPack;

public class MainClass {
	
	/*
	 * @author: Atul Kumar
	 * this class will demonstrate static and non-static block
	 * 
	 */
	static int x=1;
	static {
		
		System.out.println("static block 1");
		System.out.println("in static block 1, value of x "+x);
		System.out.println("now increasing the value of x");
		x++;
	}
static {
		
		System.out.println("static block 2");
		System.out.println("in static block 2, value of x "+x);
		System.out.println("now increasing the value of x");
		x++;
	}

	public static void main(String[] args) {
		
		System.out.println("value of x in main: "+MainClass.x);
		
	}
}
