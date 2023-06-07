package step_3;

import java.io.*;

public class DrawStarReverse_10 {
    public static void main(String[] args) throws IOException {
        //오류남
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());

        for (int i = 0; i < count; i++) {
            for (int b = count; b > i+1; b--) {
                out.write(" ");
            }
            for (int s = 0; s < i; s++) {
                out.write("*");
            }
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }
}
