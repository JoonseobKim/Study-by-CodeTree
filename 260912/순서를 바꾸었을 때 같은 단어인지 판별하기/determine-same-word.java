import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.

        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        Arrays.sort(word1Char);
        Arrays.sort(word2Char);
        boolean ans = true;
        if (word1Char.length != word2Char.length) {
            System.out.print("No");
        }
        else {
            for (int i = 0; i < word1Char.length; i++) {
                if (word1Char[i] != word2Char[i]) {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                System.out.print("Yes");
            } else
                System.out.print("No");
        }
    }
}
