import java.util.*;

public class Binomial_Coefficient {
	// calculating factorial
	public static int factorial(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	public static int coefficient(int n, int r) {
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int fact_nr = factorial(n-r);
		
		int a = fact_n/(fact_r*fact_nr);
		System.out.print(a);
		return a;
	}
	
        // main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("value of n : ");
		int n = sc.nextInt();
		System.out.print("value of r : ");
        int r = sc.nextInt();
        
        System.out.print("binomial_Coefficient is : ");
        coefficient(n,r);
        

	}

}
