import java.util.*;
public class LargerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a: ");
		int a = sc.nextInt();
		System.out.print("enter b: ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.print("a is largest");
		}else if (a==b) {
			System.out.print("both are equal");
		}else {
			System.out.print("b is largest");
		}

	}

}
