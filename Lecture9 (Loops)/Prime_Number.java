import java.util.*;

public class Prime_Number {
	
	// checking special cases
	public static void specialCases(int n) {
		if(n<1) {
			System.out.print("enter a positive integer");
		}
		else if(n==1) {
			System.out.print("Neither prime nor composite");
		}
		else if(n==2) {
			System.out.print("Is Prime");
		}
		return;
	}
	
	// checking prime or not
	public static void prime(int n) {
		// calling the specialcases function
		specialCases(n);
		
		for(int i=2;i<=Math.sqrt(n);i++) {  // root n , is used to decrease no. of iterations
			if(n%i==0) {
				System.out.print("Not a prime");
			}else {
				System.out.print("IS Prime");
			}
			break;
		}				
		return;
	}

	public static void main(String[] args) {
		// input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive Integer : ");
		int n = sc.nextInt();
		
		// print the output
		prime(n);

	}

}
