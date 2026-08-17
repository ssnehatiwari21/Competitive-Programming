import java.util.*;

public class Main {

    public static boolean isBeautiful(int year) {
        String s = String.valueOf(year);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        y++;

        while (!isBeautiful(y)) {
            y++;
        }

        System.out.println(y);
    }
}
