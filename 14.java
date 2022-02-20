package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = in.nextInt();
		System.out.print("Enter b:");
		int b = in.nextInt();
		System.out.print("Enter n:");
		int n = in.nextInt();
		
		int price = (a*100 +b)*n;
		
		System.out.printf("Price will be %d.%d", price/100, price%100);
		in.close();
	}
}
