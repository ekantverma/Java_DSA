public class cyclicSort {

    public static void sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int currIdx = arr[i] - 1;
            if (arr[i] != arr[currIdx]) {
                int temp = arr[i];
                arr[i] = arr[currIdx];
                arr[currIdx] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 4, 3, 2, 7, 8 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}