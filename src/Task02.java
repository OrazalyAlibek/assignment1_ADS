import java.util.Scanner;

public class Task02 {
    public static double calculateSum(Scanner sc, int n) {
        if (n <= 0) {
            return 0;
        }
        double currentVal = sc.nextDouble();
        return currentVal + calculateSum(sc, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalSum = calculateSum(sc, n);
        double average = totalSum/n;
        System.out.println(average);
    }
}
