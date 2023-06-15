package step_3;

import java.io.*;

public class DrawStarReverse_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());

        for (int i = 0; i < count; i++) {
            for (int j = count-1; j >= 0; j--) {
                if(i < j) out.write(" ");
                else out.write("*");
            }
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }
}