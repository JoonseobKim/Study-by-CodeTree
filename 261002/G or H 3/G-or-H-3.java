

import java.util.*;
/**입력받을 것
 * 사람의 수n / 구간의 수 k / 사람의 위치 / 무슨팻말?
 * 구간
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[100001];
        for(int i =0; i<n;i++) {
            int idx = sc.nextInt();
            char chr = sc.next().charAt(0);
            
            if(chr == 'G')
                arr[idx] = 1;
            else
                arr[idx] = 2;
        }
        
        int    ans = 0;
        
        //시작 위치 설정
        for(int i =0;i<100001-k;i++) {
            
            int sum = 0;
            //시작 위치 부터 k범위 탐색
            for(int j =0;j<=k;j++) {
                sum += arr[i+j];
                
            }
            ans = Math.max(ans, sum);
        }
        
        System.out.println(ans);
    }
}

