package homeworkClass3;

import java.util.Scanner;

public class Even_oddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter n no of i/p");
		int a = sc.nextInt();
		int sumodd=0,sumeven=0,num=0;
		System.out.printf("Enter i/p one at time: ");
		
		for (int i = 0; i < a; ++i ) {
			num = sc.nextInt();
			if ((num % 2) == 0) {
				sumeven+= num;
			}
			else {
				sumodd+= num;
			}
		}	
		
		System.out.printf("\nSum of odd numbers: " + sumodd);
		System.out.printf("\nSum of even numbers: " + sumeven);
		sc.close();	
		
	}
}