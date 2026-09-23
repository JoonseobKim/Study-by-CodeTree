import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while (dq.size() > 1) {

            // 1. 맨 앞 제거
            dq.pollFirst();

            // 2. 남은 맨 앞을 맨 뒤로 이동
            dq.addLast(dq.pollFirst());
        }

        System.out.print(dq.peekFirst());

    }
}