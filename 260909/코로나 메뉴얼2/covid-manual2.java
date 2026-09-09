import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] state = new String[3];
        int[] count = new int[4];
        int[] heat = new int[3];

        for (int i = 0; i < 3; i++) {
            state[i] = sc.next();
            heat[i] = sc.nextInt();

            if (state[i].equals("Y") && heat[i] >= 37)
                count[0]++;
            if (state[i].equals("N") && heat[i] >= 37)
                count[1]++;
            if (state[i].equals("Y") && heat[i] < 37)
                count[2]++;
            if (state[i].equals("N") && heat[i] < 37)
                count[3]++;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(count[i] + " ");
        }
        if (count[0] >= 2)
            System.out.print("E");

    }
}
