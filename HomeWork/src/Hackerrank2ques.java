import java.util.Scanner;

public class Hackerrank2ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		if(N>=2 && N<=20)
		do {
				int result;
			    result = N*i;
			    System.out.println(N + "*" + i + "=" + result);
			    i++;
		}while(i>=1 && i<=10);
		sc.close();
		
		

	}

}
