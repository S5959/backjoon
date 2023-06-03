package step_3;

import java.io.*;
import java.util.StringTokenizer;

public class BufferedReaderWriter_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] result = new int[count];
        for(int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int sum = 0;
            while(st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            result[i] = sum;
        }

        for(int sum : result) {
            bw.write(sum);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
