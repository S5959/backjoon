package step_3;

import java.util.Scanner;

public class ArithmeticSequence_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        /*
        * 등차수열 : 1부터 n까지 수의 합
        *
        * [공식] 𝚺 = n(n+1) / 2
        * */
        int result = num * (num+1) / 2;

        // 아래와 동일한 결과
        // int result = 0;
        // for(int i = 1; i <= n; i++) {
        //      result += i;
        // }

        System.out.println(result);
    }
}
