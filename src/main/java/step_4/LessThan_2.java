package step_4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LessThan_2 {
    public static void main(String[] args) throws IOException {
        // X보다 작은 수
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        if(tokenizer.countTokens() < 2) return;

        int count = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(in.readLine(), " ");
        if(tokenizer.countTokens() < count) return;

        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0; i<count; i++) {
            int y = Integer.parseInt(tokenizer.nextToken());
            if(y < x) array.add(y);
        }

        System.out.println(array.toString());
    }
}
