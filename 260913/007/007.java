import java.util.Scanner;

public class Main {

    static class Agent {
        String secretCode;
        char meetingPoint;
        int time;

        Agent(String secretCode, char meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();

        Agent agent = new Agent(sCode, mPoint, time);

        System.out.println("secret code : " + agent.secretCode);
        System.out.println("meeting point : " + agent.meetingPoint);
        System.out.println("time : " + agent.time);
    }
}