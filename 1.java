package InOut;

import java.util.Scanner;

public class InOut {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = in.nextInt();
		System.out.print("Enter b:");
		int b = in.nextInt();
		System.out.printf("Rezult: %.2f", Math.sqrt(a*a+b*b));
		in.close();
	}
}