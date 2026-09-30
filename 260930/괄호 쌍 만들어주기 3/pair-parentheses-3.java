import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        // Please write your code here.

        int open = 0;
        long answer = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                open++;
            } else {
                answer += open;
            }
        }

        System.out.println(answer);
    }
}