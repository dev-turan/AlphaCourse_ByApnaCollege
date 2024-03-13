import java.util.*;   //utility package

public class Largest_Number {
	
//	in Java Utility package we have default libraries which we can access and can make our coding easy.
//  for minus-infinity = Integer.MIN_VALUE
//	for plus-infinity = Integer.MAX_VALUE
	
	public static int LargestNumber(int arr[],int n) {
		int a = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>a) {
				a = arr[i];
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("enter the array size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter the array elements: ");
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		LargestNumber(arr,n);

	}

}
