package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChangeBall_6 {
    public static void main(String[] args) throws IOException {
        // 공바꾸기
        BufferedReader in = new BufferedReader(new InputStreamReade(System.in));
        
        StringTokenizer tokenizer = new StringTokenizer(in.readLine(), " ");
        if(tokenizer.countTokens() != 2) return;

        int basketCount = Integer.parseInt(tokenizer.nextToken());
        int putCount = Integer.parseInt(tokenizer.nextToken());

        for(int i=0; i<putCount; i++) {
            tokenizer = new StringTokenizer(in.readLine(), " ");
            if(tokenizer.countTokens() != 3) {
                i--; 
                continue;
            }

            int start = Integer.parseInt(tokenizer.nextToken());
            int end = Integer.parseInt(tokenizer.nextToken());
            int ball = int start = Integer.parseInt(tokenizer.nextToken());
            if(start > end) {
                int temp = start;
                start = end;
                end = temp;
            }
            
            
        }

        System.out.println(max);
        System.out.println(index);
    }
}
