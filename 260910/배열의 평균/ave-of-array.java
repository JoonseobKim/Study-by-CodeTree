import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double x_sum = 0;
        double y_sum = 0;
        double sum = 0;

        int[][] arr = new int[2][4];
        for (int i = 0; i < 2; i++) {
            x_sum = 0;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                x_sum += arr[i][j];
                sum += arr[i][j];
            }
            System.out.printf("%.1f ", x_sum / 4);
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            y_sum = 0;
            for (int j = 0; j < 2; j++) {
                y_sum += arr[j][i];
            }
            System.out.printf("%.1f ", y_sum / 2);
        }
        System.out.println();
        System.out.printf("%.1f ", sum / 8);
    }
}
