import java.util.*;

public class KadanesAlgo {
	public static void kadaneAlgo(int arr[]) {
		int n = arr.length;
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			cs = cs+arr[i];
			
			if(cs < 0) {
				cs = 0;
			}
			
			ms = Math.max(cs, ms);
		}
		
		// printing the ms
		System.out.print(ms);
	}

	// main function
	public static void main(String[] args) {
		// input from user
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];

		// taking input of array elements
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// calling the function
		kadaneAlgo(arr);

	}

}
