package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = in.nextInt();
		
		System.out.printf("Next odd is %d", n + 2 - n%2);
		in.close();
	}
}
