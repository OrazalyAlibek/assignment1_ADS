import java.util.Scanner;

public class Task03 {
    public static boolean isPrime(int n, int divisor) {
        if (divisor == n) {
            return true;
        }
        else if (n % divisor == 0) {
            return false;
        }
        return isPrime(n,divisor+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<2) {
            System.out.println("Not prime and not composite ");
        }
        else {
            System.out.println(isPrime(n,2) ? "Prime" : "Composite");
        }
    }
}
