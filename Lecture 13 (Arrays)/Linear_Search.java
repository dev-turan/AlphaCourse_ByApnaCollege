import java.util.*;
public class Linear_Search {
	
	public static void LinearSearch(int arr[], int key) {
		for(int i=0 ;i<arr.length ;i++) {
			if(key == arr[i]) {
				System.out.print(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the array length: ");
		int n = sc.nextInt();
		System.out.print("enter the elements: ");
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			}
		System.out.print("enter the variable: ");
		int key = sc.nextInt();
		 
		LinearSearch(arr,key);

	}

}
