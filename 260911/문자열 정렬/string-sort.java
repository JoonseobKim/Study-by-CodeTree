import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] ans = s.toCharArray();
        Arrays.sort(ans);
        String sortedans = new String(ans);
        System.out.print(sortedans);
    }
}