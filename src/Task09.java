import java.util.Scanner;

public class Task09 {
    public static int Counter(String s, int start) {
        if (start == s.length()) {
            return 0;
        }
        return Counter(s, start + 1) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Counter(s,0));

    }
}
