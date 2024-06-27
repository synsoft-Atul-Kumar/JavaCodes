package mainPack;

public class MainPack {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		
		//primitive int to Int and vice versa
		int x=29;
		
		Integer xVal=Integer.valueOf(x);
		System.out.println(xVal);
		int xx=xVal.intValue();
		System.out.println(xx);
		
		
		// primitive to string and vice versa
		
		
		byte a=100;
		String s=Byte.toString(a);
		byte b=Byte.parseByte(s);
		System.out.println("value of byte to string  "+a+"\t"+b);
		System.out.println();
	}
	

}
