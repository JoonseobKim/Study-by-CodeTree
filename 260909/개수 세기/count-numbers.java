import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N;i ++){
            arr[i] = sc.nextInt();
            if(arr[i] == M)
                cnt++;
        }
        System.out.print(cnt);
    }
}