package basics;

import java.util.Scanner;

public class LoopsProblem {

	public static void main(String[] args) {

		
		//sum of first n natural numbers
//		int sum =0;
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i =1; i<=n; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		//table of a number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(i*n);
		}

	}

}
