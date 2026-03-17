import java.util.Scanner;

public class Task02 {
    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
            return arr[i] + sum(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double sum = sum(arr, 0);
        double average = sum / n;
        System.out.println(average);
    }
}
