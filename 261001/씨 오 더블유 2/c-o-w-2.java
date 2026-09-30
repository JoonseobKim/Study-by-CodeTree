import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'C') {
                for (int j = i; j < n; j++) {
                    if (str.charAt(j) == 'O') {
                        for (int k = j; k < n; k++) {
                            if (str.charAt(k) == 'W') {
                                cnt++;
                            }
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}
