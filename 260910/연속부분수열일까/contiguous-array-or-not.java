import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        boolean hehe = false;
        int[] arrA = new int[sc.nextInt()];
        int[] arrB = new int[sc.nextInt()];
        for (int i = 0; i < arrA.length; i++)
            arrA[i] = sc.nextInt();
        for (int i = 0; i < arrB.length; i++)
            arrB[i] = sc.nextInt();
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] == arrB[0]) {
                for (int j = 0; j < arrB.length; j++) {
                    if (i + j >= arrA.length || arrA[i + j] != arrB[j]) {
                        cnt = 0;
                        break;
                    } else {
                        cnt++;
                        if (arrB.length == cnt) {
                            hehe = true;
                            System.out.print("Yes");
                            break;
                        }
                    }
                }
            }
        }
        if (!hehe)
            System.out.print("No");
    }
}
