package mainPack;

public class MainClass {
	
	
	int x;
	
	MainClass(){
		System.out.println(this);
		//System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println();
		new MainClass();
		new MainClass();
	}

}
