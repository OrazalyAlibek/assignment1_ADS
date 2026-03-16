import java.util.Scanner;

public class Task7 {
    public static void reverse(int[] arr, int start) {
        if (start == arr.length) {
            return;
        }
        reverse(arr, start + 1);
        System.out.print(arr[start]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0);
    }

}
