import java.util.Scanner;

public class Task08 {

    public static boolean AllDigits(String s, int i) {
        if (i == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(i))) {
            return false;
        }
        return AllDigits(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(AllDigits(s,0)? "Yes ": "No");
    }
}
