package zoho.corp;
import java.io.*; 

public class Pyramid {
	public static void printStars(int n) 
	{ 
		int i, j; 
		int c=1;
		
		for(i=0; i<n; i++) 
		{ 

			
			for(j=2*(n-i); j>=0; j--) 
			{ 
				if(i != n - 1){
					System.out.print(" ");
				}
			} 
			
			
			for(j=0; j<=i; j++) 
			{ 
				
				System.out.print(c++ + " "); 
			} 
			
			
			System.out.println(); 
			
		}
	}
	public static void main(String[] args) {
		
		int n = 5; 
		printStars(n); 

	}
	
	

}
