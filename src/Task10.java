import java.util.Scanner;

public class Task10 {
    public static int GCD(int a,int b) {
        if (b == 0) return a;
        return GCD(b,a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(GCD(n1,n2));
    }
}
