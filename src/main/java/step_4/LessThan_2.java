package step_4;

import java.io.*;
import java.util.*;

public class LessThan_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        if(tokenizer.countTokens() < 2) return;

        int size = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(in.readLine(), " ");
        if(tokenizer.countTokens() < size) return;

        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            int num = Integer.parseInt(tokenizer.nextToken());
            if(num < x) builder.append(num).append(" ");
        }

        System.out.println(builder);
    }
}
