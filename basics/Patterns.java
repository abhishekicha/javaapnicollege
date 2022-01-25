package basics;

public class Patterns {

	public static void main(String[] args) {
		
//		int n=4;
//		int m=5;
//
//		//rectangle
//		for(int i=1; i<=n; i++) {
//
//			for(int j=1; j<=m; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//hollow rectangle
//		int n=4;
//		int m =5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j =1; j<=m; j++) {
//				if(i==1 || j==1|| i==n || j==m) {
//					System.out.print("*");
//				}else{
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println();
//		}
		
		//new
		
//		int n=4;
//		
//		for(int i =1; i<=n; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		int n=4;
//		
//		for(int i =n; i>=1; i--) {
//			for(int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//new
		
//		int n=4;
//		
//		for(int i =1; i<=n; i++) {
//			for(int j =1; j <= n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j =1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//new
		
//		int n=5;
//		
//		for(int i =1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//
//		}
		

		//new
		
//		int n=5;
//		
//		for(int i =n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//
//		}
		
		//new
		
//		int n=5;
//		int number = 1;
//		
//		for(int i =1; i<=n; i++) {
//			for(int j =1; j<=i; j++) {
//				System.out.print(number);
//				number++;
//			}
//			System.out.println();
//		}
		
		
		//new
		
//		int n =5;
//		
//		for(int i =1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				int sum = i+j;
//				if(sum % 2 ==0) {
//					System.out.print("1 ");
//				}else {
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}
		
		//new butterfly
		
//		int n =5;
//		for(int i =1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			
//			int spaces = 2*(n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		
//		//lower half
//				for(int i =n; i>=1; i--) {
//					for(int j=1; j<=i; j++) {
//						System.out.print("*");
//					}
//					
//					int spaces = 2*(n-i);
//					for(int j=1; j<=spaces; j++) {
//						System.out.print(" ");
//					}
//					
//					for(int j=1; j<=i; j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//					
//				}
		
		//new rombus
		
//		int n=5;
//		
//		for(int i =1; i<=n; i++ ) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			//stars
//			for(int j =1; j<=5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//number pyramid
		
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int j =1; j<=i; j++) {
//				System.out.print(i+ " ");
//				
//			}
//			System.out.println();
//		}
		
		//palindromic pattern
		
//		int n =5;
//		
//		for(int i =1; i<=n; i++) {
//			//spaces
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			//1st half numbers
//			
//			for(int j =i; j>=1; j--) {
//				System.out.print(j);
//			}
//			//2nd half 
//			for(int j=2; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
		
		//new diamond pattern
		
		int n =4;
		//upper half
		for(int i =1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//stars
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower half
		
		for(int i =n; i>=1; i--) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//stars
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
