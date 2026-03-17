import java.util.Scanner;

public class Task07 {
    public static void reverse(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        int currentNum = sc.nextInt();
        reverse(n-1,sc);
        System.out.print(currentNum + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reverse(n, sc);
        }
    }
}
