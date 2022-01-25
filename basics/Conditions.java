package basics;

import java.util.*;

public class Conditions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		 char sym = sc.next().charAt(0);
		
		switch(sym){
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '/': System.out.println(a/b);
		break;
		case '*': System.out.println(a*b);
		break;
		default: System.out.println("invalid");
		}
		
		
	}

}
