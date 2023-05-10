package step_1;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double result = (double) num1 / num2;

        System.out.printf("%.9f", result);
    }
}
