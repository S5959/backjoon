package step_2;

import java.util.Scanner;

public class AlarmClock_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        sc.close();

        if (minute < 45) {
            minute += 15;
            if(hour == 0) hour = 23;
            else hour -= 1;
        }
        else minute -= 45;

        System.out.println(hour + " " + minute);
    }
}
