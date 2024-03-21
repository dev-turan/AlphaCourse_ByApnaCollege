import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter integers (0 to stop):");

	        int evenSum = 0;
	        int oddSum = 0;
	        int num;

	        while ((num = scanner.nextInt()) != 0) {
	            if (num % 2 == 0)
	                evenSum += num;
	            else
	                oddSum += num;
	        }

	        System.out.println("Sum of even integers: " + evenSum);
	        System.out.println("Sum of odd integers: " + oddSum);

	}

}
