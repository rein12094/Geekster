import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int k = 0; k < n; k++) {
			a[k] = sc.nextInt();
		}
		for (int k = 0; k < n; k++) {
			System.out.print(a[k]);
		}
		for (int i = 0; i < n; i++) {
			int firstno = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > firstno) {
				a[j + 1] = a[j];
				j--;
				a[j + 1] = firstno;
				
			}
			System.out.println();

		}

		for (int i = 0; i < n; i++) {
			
			System.out.print(a[i]);
			

			sc.close();

		}

	}

}
