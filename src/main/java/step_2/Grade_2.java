package step_2;

import java.util.Scanner;

public class Grade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.close();

        String result;
        if (grade >= 90) result = "A";
        else if (grade >= 80) result = "B";
        else if (grade >= 70) result = "C";
        else if (grade >= 60) result = "D";
        else result = "F";

        System.out.println(result);
    }
}
