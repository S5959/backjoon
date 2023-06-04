package step_3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCaseNumber_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i=1; i<=count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + (num1+num2));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
