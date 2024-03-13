import java.util.*;

public class Basic3_CallByValue {
	
	public static void swap(int a, int b) {
	//  swap value code
		int temp = a;
		a=b;
		b= temp;
		
		System.out.println("a is : " + a);
		System.out.println("b is : " + b);
	}
	
	public static int product(int a, int b) {
	// multiplication
	     int result = a*b;
         return result;
	}
	
	
	public static void main (String[]args) {
	int a = 5;
	int b = 6;
	swap(a,b);
	int pro = product(a,b);
	System.out.println("product is : " + pro);
	pro = product(10,20);
	System.out.print("product is : " + pro);

	}

}
