import java.util.*;
public class Basic2_SyntaxWithParameters {
	
//	public static void calculatesum1(int a, int b) {
//		int sum = a + b;
//		System.out.print("sum is : " + sum);
//		return;
//	}
//
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    int a = sc.nextInt();
//	    int b = sc.nextInt();
//	    calculatesum1(a,b);
	
	public static int calculatesum2(int a, int b) {   // a,b here is formal parameters
		int sum = a + b ;  // this sum variable is of class calculatesum2
		return sum ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = calculatesum2(a,b);  // a,b here are actual parameters
		// this sum varialble is diff. from the above one
		
		System.out.print("sum is : " + sum);
	
	}
	

}
