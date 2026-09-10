import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.print(count(A, B));
    }

    public static int count(int A, int B) {

        int cnt = 0;

        for (int i = A; i <= B; i++) {

            // 3의 배수면 바로 카운트
            if (i % 3 == 0) {
                cnt++;
                continue;
            }

            int num = i;

            // 각 자리에서 3, 6, 9 확인
            while (num > 0) {

                int digit = num % 10;

                if (digit == 3 || digit == 6 || digit == 9) {
                    cnt++;
                    break;
                }

                num /= 10;
            }
        }

        return cnt;
    }
}
