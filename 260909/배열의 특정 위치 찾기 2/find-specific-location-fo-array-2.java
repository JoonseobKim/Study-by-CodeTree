import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int hol = 0;
        int jak = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                hol += arr[i];
            } else {
                jak += arr[i];
            }
        }

        if (hol >= jak)
            System.out.print(hol - jak);
        else
            System.out.print(jak - hol);

    }
}
