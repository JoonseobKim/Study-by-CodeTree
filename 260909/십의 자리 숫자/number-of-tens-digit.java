import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] num = new int[100];
        int[] count = new int[10];
        for (int i = 0; i < 100; i++) {
            num[i] = sc.nextInt();

            if (num[i] / 10 >= 1) {
                count[num[i] / 10]++;
            }
            if (num[i] == 0) {
                break;
            }
        }

        for (int i = 1; i < count.length; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}
