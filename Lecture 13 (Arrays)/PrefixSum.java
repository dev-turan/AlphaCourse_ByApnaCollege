import java.util.*;

public class PrefixSum {
	
	public static void prefixsum(int arr[]) {
		int n = arr.length;
		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;
		int prefix[] = new int[n];
		
		// declaring prefix array
		prefix[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefix[i] = prefix[i-1]+arr[i];
		}
		
		// finding maxsum
		for(int start=0; start<n ;start++) {
			for(int end=start; end<n; end++) {
				currsum = (start==0) ? prefix[end] : prefix[end] - prefix[start-1];
				
				if(currsum > maxsum) {
					maxsum = currsum;
				}
				
			}
		}
		// printing maxsum
		System.out.print(maxsum);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// calling the function
		prefixsum(arr);
	}

}
