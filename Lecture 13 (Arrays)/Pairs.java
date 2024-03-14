import java.util.*;

public class Pairs {
	
	public static void Printpairs(int arr[]) {
		int count = 0 ;
		
		for(int i=0; i<arr.length; i++) {
			int current = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				System.out.print("("+ current + "," + arr[j] + ")");
				count ++;
			}
			System.out.println();
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
        Printpairs(arr);
	}

}
