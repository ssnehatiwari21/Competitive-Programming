import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = "hello";
        int idx = 0;
        for (int i = 0; i < s.length() && idx < target.length(); i++) {
            if (s.charAt(i) == target.charAt(idx)) {
                idx++;
            }
        }
        System.out.println(idx == target.length() ? "YES" : "NO");
    }
}
