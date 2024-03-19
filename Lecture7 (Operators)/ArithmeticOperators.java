
public class ArithmeticOperators {

	public static void main(String[] args) {
		// there are two types of AO :
		//   1. Binary          2. Unary
		//    +,-,*,/,%          ++,--
		
		int a = 10;
		int b =2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);  // modulo gives remainder
		
		
		System.out.println(++a);    // pre increment
		System.out.println(--b);	// pre decrement 
		System.out.println(a++);    // post increment
		System.out.println(b--);    // post decrement

	}

}
