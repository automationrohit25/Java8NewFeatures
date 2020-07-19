package programs1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fiblength;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		fiblength = sc.nextInt();
		
		int[] num = new int[fiblength];
		num[0]=0;
		num[1]=1;
		
		for (int i = 2; i < num.length; i++) {
			num[i] = num[i-1] + num[i-2];
		}
		
		System.out.println("Fibonacci series");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
	}

}
