import java.util.*;

public class l786 {
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (x, y) -> Double.compare((double) y[0] / y[1], (double) x[0] / x[1]));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxHeap.add(new int[] { arr[i], arr[j] });
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        return maxHeap.peek();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int k = 3;

        int ans[] = kthSmallestPrimeFraction(arr, k);
        System.out.println(ans[0] + " " + ans[1]);
    }
}