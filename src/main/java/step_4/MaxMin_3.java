package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin_3 {
    public static void main(String[] args) throws IOException {
        /*
        * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
        * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
        * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
        * */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        if(st.countTokens() != count) return;

        int max = -1000000;
        int min = 1000000;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            max = Integer.max(max, num);
            min = Integer.min(min, num);
        }

        System.out.println(min + " " + max);
    }
}
