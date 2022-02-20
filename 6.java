package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = in.nextInt();
		
		
		System.out.printf("Number of decades is %d", n/10);
		in.close();
	}
}