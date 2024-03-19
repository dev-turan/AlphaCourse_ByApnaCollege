import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		
		if(income<=500000) {
			System.out.print("No Tax");
		}else if (income>500000 && income<=1000000) {
			System.out.print( (income*(0.2)) );
		}else {
			System.out.print( (income*(0.3)) );
		}

	}

}
