import java.util.*;
public class SubArray {
	
	public static void PrintSubArray(int arr[]) {
		int n = arr.length;
		int count = 0;
		
		for(int start=0;start<n;start++) {
			for(int end=start;end<n;end++) {
				int sum =0;
				
				for(int i=start;i<=end;i++) {
					sum += arr[i];
					System.out.print(arr[i]);
				}
				
				System.out.print(" "+ sum);
				System.out.println();
				count ++;
			}
			System.out.println();
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		PrintSubArray(arr);

	}

}
