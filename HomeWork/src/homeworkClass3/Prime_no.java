package homeworkClass3;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%1==0 && n%n==0) {
         if(n%2==0) {
        System.out.println("No is prime" + n); 
        
        }
         else {
        	 System.out.println("No is not prime");
         }
        }
        
        input.close();

	}

}
