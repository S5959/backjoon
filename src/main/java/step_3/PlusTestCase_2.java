package step_3;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusTestCase_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            results.add(a+b);
        }

        for(int result : results) {
            System.out.println(result);
        }
    }
}
