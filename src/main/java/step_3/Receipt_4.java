package step_3;

import java.util.Scanner;

public class Receipt_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int totalCount = sc.nextInt();

        for(int i=0; i<totalCount; i++) {
            int price = sc.nextInt();
            int count = sc.nextInt();

            totalPrice -= (price * count);
        }

        String isCorrected = "Yes";
        if(totalPrice != 0) isCorrected = "No";

        System.out.println(isCorrected);
    }
}
