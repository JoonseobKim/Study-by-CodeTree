import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {

            int q1 = sc.nextInt();

            // case 1 : q1 = 1
            if (q1 == 1) {
                System.out.print(nums[sc.nextInt() - 1]);
            }
            // case 2 : q1 = 2
            else if (q1 == 2) {
                int q2 = sc.nextInt();
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (nums[j] == q2) {
                        System.out.print(j + 1);
                        cnt++;
                        break;
                    }
                }
                if (cnt == 0)
                    System.out.print(cnt);
            }
            // case 3 : q1 = 3
            else if (q1 == 3) {
                int q2 = sc.nextInt();
                int q3 = sc.nextInt();
                for (int j = 0; j < N; j++) {
                    if (j >= q2 - 1 && j <= q3 - 1) {
                        System.out.print(nums[j] + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
