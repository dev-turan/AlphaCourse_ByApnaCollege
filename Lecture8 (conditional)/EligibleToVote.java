import java.util.*;
public class EligibleToVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.print("Eligible");
		}else if(age<18 && age>0){
			System.out.print("not eligible");
		}else {
			System.out.print("enter a valid age");
		}
	}

}
