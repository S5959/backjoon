package step_3;

import java.io.*;

public class DrawStar_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(in.readLine());

        for(int i=1; i<=count; i++) {
            for (int j = 0; j < i; j++) {
                out.write("*");
            }
            out.newLine();
        }

        out.flush();
        out.close();
        in.close();
    }
}
