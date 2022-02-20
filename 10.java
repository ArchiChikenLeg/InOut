package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = in.nextInt();
		
		System.out.printf("Time is %d:%d", (n/60)%24, n%60);
		in.close();
	}
}