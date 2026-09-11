import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.print(func(a*b*c));

    }

    public static int func(int n){
        if(n/10 == 0){
            return n%10;
        }

        return n%10 + func(n/10);
        
    }
}