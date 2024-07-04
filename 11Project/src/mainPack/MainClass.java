package mainPack;

import java.util.Scanner;

public class MainClass {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("enter first number");
		int k=sc.nextInt();
		System.out.println(k+" is the entered number");
		System.out.println("enter the seocnd number");
		int m=Integer.parseInt(sc.next());
		System.out.println(m+" is the entered second number");
		
	}
}
