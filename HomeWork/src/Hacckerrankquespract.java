import java.util.Scanner;

public class Hacckerrankquespract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for(int x=0;x<3;x++) {
	      String s = scan.nextLine();
	      if(s.length()>0 && s.length()<=15) {
	    	  
	      }
		
	      int i = scan.nextInt(); 
	      if(i>0 && i<=999) 
		          if(i>0 && i<=9) {
		        	  int i1 = i;
		        	  
		        	  System.out.printf("%-15s%03d%n", s, i1);		        	  
		        	  
		          }
				  else if(i>=10 && i<=99) {
					  int i2 = i;
					  
					  System.out.printf("%-15s%03d%n", s, i2);
					  
			      }
		  else {
			 
			  System.out.printf("%-15s%%n", s, i);

			   }
		  System.out.println("================================");
	      
}
	}
}

