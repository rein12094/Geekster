package Homeworkclass2;

import java.util.Scanner;

public class Absoluteno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//      System.out.println("Absolute no is " + Math.abs(n));
//      input.close();
      Scanner scan = new Scanner(System.in);
      int i = scan.nextInt(); 
      double d = scan.nextDouble();
      String s = scan.next();
      s+=scan.nextLine();
     
      // Write your code here.

      System.out.print("String: " + s);
      System.out.println(" ");
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
      scan.close();
	}
	
}
	