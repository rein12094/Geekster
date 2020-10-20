package homeworkclass4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int cpp = 0;
		for(int i=0; i<n; i++) {
			int n1= sc.nextInt();
			System.out.println(n1); 
			if (n1>0) {
  			
	  		for(int cp = 0; cp<=n; cp++) {
	  			cpp = cpp+cp; 
		    
			}
	  		System.out.println("num is positive " + n1);
	  		System.out.println("num is positive " + cpp);
	  		
			}
//			if(num<0) {
//				System.out.println("num is negative "+ num);
//			}
		}
		
		 sc.close();
	}
}
//		int a = sc.nextInt();
//		  for(int i = 0; i<a; i++) {
//			  int num = sc.nextInt();
//			  System.out.println("num is positive " + num);
//			  sc.close();
//			}
////		  if (num>0) {
////				System.out.println("num is positive " + num);
////		  		for(int cp = 0; cp<=num; cp++) {
////			    System.out.println("No. of positive " + cp);
////				}
////				if(num<0) {
////					System.out.println("num is negative "+ num);
////				}
////				else {
////					System.out.println("num is zero " + num);
////			}
//		}
		

//	}


