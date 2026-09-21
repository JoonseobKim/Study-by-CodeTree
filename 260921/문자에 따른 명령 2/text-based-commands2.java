import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int x = 0;
        int y = 0;

        // 0: 북, 1: 동, 2: 남, 3: 서
        int dir = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'L') {
                dir = (dir + 3) % 4;

            } else if (s.charAt(i) == 'R') {
                dir = (dir + 1) % 4;

            } else if (s.charAt(i) == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.print(x + " " + y);
    }
}