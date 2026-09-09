import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[100];
        int ans = 0;

        for (int i = 0; i < 100; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] == 0) {
                ans = nums[i - 1] + nums[i - 2] + nums[i - 3];
                break;
            }
        }

        System.out.print(ans);
    }
}
