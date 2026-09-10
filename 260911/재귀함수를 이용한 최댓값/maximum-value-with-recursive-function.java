import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(func(n - 1, arr));
    }

    public static int func(int n, int[] arr){
        if(n == 0)
            return arr[n];
        return Math.max(arr[n], func(n - 1, arr));
    }
}