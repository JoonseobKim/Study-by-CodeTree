import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int ans = 0;
        int test = 0;

        char[] arr = new char[a.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.charAt(i);
        }

        for (int i = 0; i < a.length(); i++) {
            char tmp = arr[i];
            if (arr[i] == '1')
                arr[i] = '0';
            else if (arr[i] == '0')
                arr[i] = '1';

            test = 0;

            for (int j = 0; j < arr.length; j++) {
                test = test * 2 + (arr[j] - '0');
            }

            ans = Math.max(ans, test);

            arr[i] = tmp;
        }

        System.out.print(ans);

    }
}
