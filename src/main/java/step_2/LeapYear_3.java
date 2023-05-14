package step_2;

import java.util.Scanner;

public class LeapYear_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        int isLeapYear;
        if (year % 400 == 0) isLeapYear = 1;
        else if (year % 100 == 0) isLeapYear = 0;
        else if (year % 4 == 0) isLeapYear = 1;
        else isLeapYear = 0;

        System.out.println(isLeapYear);
    }
}
