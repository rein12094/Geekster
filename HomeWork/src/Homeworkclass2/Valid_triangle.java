package Homeworkclass2;

import java.util.Scanner;

public class Valid_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int A1 = input.nextInt();
        int A2 = input.nextInt();
        int A3 = input.nextInt();
        System.out.print("IP - ");
        System.out.print(A1);
        System.out.print( " " + A2);
        System.out.print( " " + A3);
        System.out.println();
        int SOA = (A1+A2+A3);
        if(SOA==180) {
        	System.out.println("Valid");
        }
        	else {
        		System.out.println("Not Valid");
        	}
        }
        
	}
