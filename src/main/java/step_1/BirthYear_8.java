package step_1;

import java.util.Scanner;

public class BirthYear_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thailandYear = sc.nextInt();
        int koreaYear = thailandYear - 543;

        System.out.println(koreaYear);
    }
}
