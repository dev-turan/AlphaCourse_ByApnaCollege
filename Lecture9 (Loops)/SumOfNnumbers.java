import java.util.*;
public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n>0) {
			sum+=n;
			n-=1;
		}
		
		System.out.print(sum);

	}

}
