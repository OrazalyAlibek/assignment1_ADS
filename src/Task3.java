import java.util.Scanner;

public class Task3 {
    public static boolean isPrime(int n) {
        int divisor = 2;
        if (n <= 1) {
            return false;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(divisor);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
    }
}
