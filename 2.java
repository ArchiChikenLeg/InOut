package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = in.nextInt();

		System.out.printf("The next number for the number %d is %d\n", a, a+1);
		System.out.printf("The previous number for the number %d is %d\n", a, a-1);
		in.close();
	}
}
