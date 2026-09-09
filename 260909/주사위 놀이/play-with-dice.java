import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[10];
        int[] count = new int[6];
        for (int i = 0; i < 10; i++) {
            dice[i] = sc.nextInt();
            count[dice[i] - 1]++;
        }
        for(int i = 0 ; i< 6; i++){
            System.out.println((i+1) + " - " + count[i]);
        }

    }
}
