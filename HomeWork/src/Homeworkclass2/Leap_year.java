package Homeworkclass2;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<1582) {
         System.out.println("/n enter year greater than 1582");	
        }
        else if(n%4==0) {
         if(n%100==0 && n%400!=0) {
        	 System.out.println("Not a Leap Year");
         }
         else {
      	   System.out.println("Leap Year");
      	 input.close();
         }
         }
	}
}
           
  
