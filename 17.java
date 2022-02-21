package InOut;

import java.util.Scanner;

public class InOut {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter scholars:");
		int n = in.nextInt();
		System.out.print("Enter apples:");
		int k = in.nextInt();
		System.out.printf("Rezult: %d", (n - k%n)%7);
		in.close();
	}
}
