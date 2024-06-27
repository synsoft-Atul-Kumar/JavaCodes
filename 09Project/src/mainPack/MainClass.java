package mainPack;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length < 0)
			System.out.println("no arguments found ");
		else {
			for (String string : args) {
				System.out.println(string);
			}
		}

	}

}
