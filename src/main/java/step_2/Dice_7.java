package step_2;

import java.util.Scanner;

public class Dice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int money;
        if((A == B) && (B == C)) money = 10000 + (A * 1000);
        else if ((A != B) && (B != C) && (A != C)) {
            int max;

            if ((A > B) && (A > C)) max = A;
            else if ((B > A) && (B > C)) max = B;
            else max = C;

            money = max * 100;
        }
        else {
            int same;
            if ((A == B) && (A != C)) same = A;
            else if ((B == C) && (B != A)) same = B;
            else same = C;

            money = 1000 + (same * 100);
        }

        System.out.println(money);
    }
}
