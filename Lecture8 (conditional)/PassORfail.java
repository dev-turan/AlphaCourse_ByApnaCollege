import java.util.*;

public class PassORfail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		String result = (marks >= 33) ? "pass" : "fail" ;
		System.out.print(result);
	}

}
