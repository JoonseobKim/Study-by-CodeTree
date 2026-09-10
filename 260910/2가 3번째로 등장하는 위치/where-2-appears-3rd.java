import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        int cnt = 0;
        for(int i = 0 ; i<num.length;i++){
            num[i] = sc.nextInt();
            if(num[i] == 2)
                cnt++;
            if(cnt == 3){
                System.out.print(i+1);
                break;
            }
        }
    }
}