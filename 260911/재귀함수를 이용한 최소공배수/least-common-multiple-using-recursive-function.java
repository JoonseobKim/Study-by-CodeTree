import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        // Please write your code here.
        System.out.print(func(arr, 1, arr[0]));
    }

    // 배열을 앞에서부터 하나씩 확인하면서 최소공배수 누적
    public static int func(int[] arr, int idx, int result) {

        // 모든 숫자를 확인했으면 종료
        if (idx == arr.length)
            return result;

        // 지금까지의 최소공배수와 현재 숫자의 최소공배수
        result = lcm(result, arr[idx]);

        return func(arr, idx + 1, result);
    }

    // 최소공배수
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // 최대공약수 - 재귀
    public static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}