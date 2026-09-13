import java.util.Scanner;

class User {
    String id;
    int level;
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        // 첫 번째 객체
        User user1 = new User();
        user1.id = "codetree";
        user1.level = 10;

        // 두 번째 객체
        User user2 = new User();
        user2.id = id;
        user2.level = level;

        System.out.println("user " + user1.id + " lv " + user1.level);
        System.out.println("user " + user2.id + " lv " + user2.level);
    }
}