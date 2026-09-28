import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] dr = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dc = {0, 0, -1, 1, -1, 1, 1, -1};
        
        int ans = 0;

        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                
                int sum = grid[r][c];

                for(int d = 0; d<8;d++){
                    
                    int nr = dr[d] + r;
                    int nc = dc[d] + c;

                    if(nr >= 0 && nr<n && nc>=0 && nc<n){

                        sum += grid[nr][nc];
                    }

                }

                
                ans = Math.max(sum, ans);
                
            }
        }

        System.out.print(ans);
        
    }
}