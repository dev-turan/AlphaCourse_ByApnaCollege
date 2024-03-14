import java.util.*;

public class MaxSubArraySum {

    public static void MaxSubArray(int arr[]) {
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.print(maxsum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxSubArray(arr);
    }
}
