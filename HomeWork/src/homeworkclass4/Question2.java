package homeworkclass4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("No. is " + a);
		  for(int i = 0; i<a; i++) {
			  int num = sc.nextInt();
			  System.out.println(num);
			  
			 
		  }
		  sc.close();
	}

	}