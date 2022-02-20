package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num of scholars:");
		int n = in.nextInt();
		
		System.out.print("Enter num of apples:");
		int k = in.nextInt();
		
		System.out.printf("%d apples will left", k%n);
		in.close();
	}
}


