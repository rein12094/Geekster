package Homeworkclass2;

import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		The marks obtained by a student in 3 different subjects are input by the user. 
//		Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//		Average  Grade
//		90-100   A
//		80-89    B
//		70-79    C
//		60-69    D
//		0-59     F
//
//
//		I/P - 80 67 73
//		O/P - C
//
//		I/P - 84 79 97
//		O/P - B
		Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int C = input.nextInt();
        int M = input.nextInt();
        System.out.print("IP - ");
        System.out.print(P);
        System.out.print( " " + C);
        System.out.print( " " + M );
        System.out.println();
        int avg = (P+C+M)/3;
        System.out.println("Average marks " + avg);
        if (avg>=90 ) {
        	System.out.println("Grade is A");
        	input.close();
        }
        	else if(avg>=80 && avg<90) {
        		System.out.println("Grade is B");
            	input.close();
        	}
        	else if(avg>=70 && avg<80) {
        		System.out.println("Grade is C");
            	input.close(); 
        	}
        	else if(avg>=60 && avg<70) {
        		System.out.println("Grade is D");
            	input.close();
        	}
        	else if(avg>=0 && avg<50) {
        		System.out.println("Grade is F");
            	input.close();
        }
        input.close();
        
	}

}
