package step_3;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCaseNumber_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());
        int[] sum = new int[count];
        for (int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sum[i] = num1 + num2;

            out.write("Case #" + (i+1) + ": " + sum[i]);
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }
}
