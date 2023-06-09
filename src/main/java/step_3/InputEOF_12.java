package step_3;

import java.io.*;
import java.util.StringTokenizer;

public class InputEOF_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " ");
            if(st.countTokens() < 2) break;

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            out.write(num1 + num2);
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }
}
