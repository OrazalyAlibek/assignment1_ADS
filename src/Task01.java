import java.util.Scanner;

public class Task01 {
    public static void printDigits(int n){
        if (n / 10 != 0){
            printDigits(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
    }
}
