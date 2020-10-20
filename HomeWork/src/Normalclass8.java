import java.util.Scanner;

public class Normalclass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		System.out.println("n1+n2 = " + (n1 + n2));
		int opt = 1;
//		if (opt == 1)
			do {
				int n3 = sc.nextInt();
				int n4 = sc.nextInt();
//				int opt = sc.nextInt();
				System.out.println("n3+n4 =  " + (n3 + n4));
				System.out.println("Wish to continue(0/1) :" + opt);
				int opt1 = sc.nextInt();
			} while (opt == 1);
			

//		else {
//			System.out.println("Press 1 to continue");
			sc.close();

		}
	}

