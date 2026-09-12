import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        int cnt = 0;
        boolean check = true;
        char[] t_char = t.toCharArray();
        for (int i = 0; i < n; i++) {
            check = true;
            char[] words_char = words[i].toCharArray();

            if (words_char.length < t_char.length) {
                continue;
            }
            
            for (int j = 0; j < t_char.length; j++) {
                if (words_char[j] != t_char[j]) {
                    check = false;
                    break;
                }
            }

            if (check)
                cnt++;

            if (cnt == k) {
                System.out.print(words[i]);
                break;
            }
        }
    }
}
