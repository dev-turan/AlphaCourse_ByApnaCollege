import java.util.*;

public class ReverseTheGivenNumber {

	public static void main(String[] args) {
		// taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		// initializing a reverse number
		int rev = 0;
		
		// code to reverse the number
		while(n>0) {
			int lastdigit = n%10;
			rev = (rev*10) + lastdigit ;
			n /= 10;
		}
		
		// printing the reverse of the number
		System.out.print("reverse of the number is: ");
		System.out.print(rev);
	}

}
