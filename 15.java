package InOut;

import java.util.Scanner;

public class InOut {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first time:");
		int fh = in.nextInt();
		int fm = in.nextInt();
		int fs = in.nextInt();
		System.out.print("Enter second time:");
		int sh = in.nextInt();
		int sm = in.nextInt();
		int ss = in.nextInt();
		System.out.printf("Rezult: %d", (sh-fh)*3600+(sm-fm)*60+(ss-fs));
		in.close();
	}
}
