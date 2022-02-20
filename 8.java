package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = in.nextInt();
		
		System.out.printf("Summ is %d", n%10 + (n/10)%10 + n/100);
		in.close();
	}
}
