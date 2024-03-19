// importing all java methods from java library using '*' 
import java.util.*;

// public class
public class Input_inJAVA {

	// main function
	public static void main(String[] args) {
		
		// importing Scanner class
		Scanner sc = new Scanner (System.in);  // sc is a object declared to be used again and again in code
		// using Scanner for input
		int n = sc.nextInt();  // for int type
		sc.nextLine();   
		String line = sc.nextLine();  // for line
		String name = sc.next();  // for word
		
		System.out.println(n);
		System.out.println(line);
		System.out.println(name);
		
		
		
/*   When you use nextInt(), it reads the integer value but does not consume the newline character. 
 *   So, when you call nextLine() immediately after nextInt(), it consumes the newline character left by nextInt() and returns an empty string. 
 *   This behavior can lead to unexpected results.
 *   To fix this, you can consume the newline character after nextInt() by adding an extra sc.nextLine() after nextInt() to clear the input buffer. 
*/		

	}

}
