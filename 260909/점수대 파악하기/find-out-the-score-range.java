import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] count = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }

            count[arr[i] / 10]++;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " + count[i]);
        }

    }
}
