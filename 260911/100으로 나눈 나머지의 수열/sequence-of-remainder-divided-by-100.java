import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func(2, 4, n, 2);
    }

    public static void func(int n1, int n2, int n, int cnt){
        if(cnt == n){
            System.out.print(n2);
            return;
        }
        if(n == 1){
            System.out.print(n1);
            return;
        }
        if(n == 2){
            System.out.print(n2);
            return;
        }

        int tmp = n1;
        n1 = n2;
        n2 = tmp*n1%100;

        cnt++;

        func(n1, n2, n, cnt);

    }
}