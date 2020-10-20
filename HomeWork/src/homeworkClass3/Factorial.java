package homeworkClass3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
        	factorial = factorial * i;
        }
        System.out.println("Factorial of "+ num +" is: "+factorial);
        input.close();

	}

}
