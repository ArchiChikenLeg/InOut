package InOut;

import java.util.Scanner;

public class InOutClass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num of lesson:");
		int a = in.nextInt();
		
		int rez = 540 + a*45 + ((a-1)/2)*15 + ((a-1)-((a-1)/2))*5;
		System.out.printf("Lesson ends at %d:%d", rez/60,rez%60);
		in.close();
	}
}
