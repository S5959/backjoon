package step_2;

import java.util.Scanner;

public class OvenClock_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int takenTime = sc.nextInt();
        sc.close();

        int endMinute = minute + takenTime;
        if (endMinute >= 60) {
            minute = (endMinute % 60);
            hour += (endMinute / 60);
            if(hour > 23) hour -= 24;
        }
        else minute += takenTime;

        System.out.println(hour + " " + minute);
    }
}
