import java.util.*;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		System.out.print("reverse number is: ");
		while(n>0) {
			int reverse = n%10;
			n /= 10;
			System.out.print(reverse);
		}

	}

}
