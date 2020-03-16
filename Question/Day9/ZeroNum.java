package Day9;

import java.math.BigInteger;
import java.util.Scanner;

public class ZeroNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            zeroNum(num);
        }

    }
    private static void zeroNum(int num){
        if(num <1 || num >1000){
            return;
        }
        int result = num/5+num/25+num/125+num/625;
        System.out.println(result);
    }


}
