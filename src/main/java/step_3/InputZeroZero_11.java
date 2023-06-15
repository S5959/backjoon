package step_3;

import java.io.*;
import java.util.StringTokenizer;

public class InputZeroZero_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0) break;

            System.out.println(num1 + num2);
        }

        in.close();
    }
}
