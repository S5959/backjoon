package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntCounting_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        if(st.countTokens() != size) return;

        int search = Integer.parseInt(in.readLine());

        int counting = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num == search) counting++;
        }

        System.out.println(counting);
    }
}
