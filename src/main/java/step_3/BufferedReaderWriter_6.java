package step_3;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderWriter_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());

        for(int i=0; i<count; i++) {
            StringTokenizer nums = new StringTokenizer(in.readLine(), " ");
            int num1 = Integer.parseInt(nums.nextToken());
            int num2 = Integer.parseInt(nums.nextToken());

            int sum = num1 + num2;
            out.write(sum + "\n");
        }

        out.flush();
        out.close();
        in.close();
    }
}
