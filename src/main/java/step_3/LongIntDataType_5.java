package step_3;

import java.util.Scanner;

public class LongIntDataType_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int byteSize = sc.nextInt();


        int quotient = 0;
        if(byteSize >= 4) {
            quotient = byteSize / 4;
        }

        final String prefix = "long ";
        String dataType = "int";
        for(int i=0; i<quotient; i++) {
            dataType = prefix + dataType;
        }

        System.out.println(dataType);
    }
}
