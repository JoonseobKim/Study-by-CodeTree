import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        int sum = 0;
        int sum_half =0;
        double mean = 0;
        int cnt = 0;
        for(int i = 0; i<10; i++){
            nums[i] = sc.nextInt();
            if(i%2 == 1){
                sum_half += nums[i];
            }
            if((i+1)%3 == 0) {
                sum += nums[i];
                cnt++;
            }
        }
        mean = (double) sum / cnt;

        System.out.printf("%d %.1f", sum_half, mean);

        
    }
}