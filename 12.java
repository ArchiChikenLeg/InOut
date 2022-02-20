package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = in.nextInt();
		System.out.print("Enter b:");
		int b = in.nextInt();
		
		int tmp = a;
		a = b;
		b = tmp;
		System.out.printf("a is %d and b is %d now", a, b);
		in.close();
	}
}