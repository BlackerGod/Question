package Day32;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Count2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(countNumberOf2s(num));
        }
    }
    public static int countNumberOf2s(int n) {
        // write code here
        if(n < 2){
            return 0;
        }
        int count = 0;
        String tmp = String.valueOf(n);

        for (int i=0; i<tmp.length(); i++){
            count += countAtSomeDigit(n,i);
        }
        return count;
    }
    private static int countAtSomeDigit(int num, int i){
        /**
         * 第i位出现2个次数与该位所在数字有关
         * 1.i位数字小于2，出现次数就是比其高位部分*10^i/10
         * 2.i位数字等于2，出现次数就是比其高位部分*10^i/10 + n%(10^i)
         * 3.i位数字大于2，出现次数就是（比其高位部分+1）*10^i/10
         */
        int powerOF10 = (int)Math.pow(10.0,i);
        int nextPower = powerOF10 * 10;
        int right = num % powerOF10;
        int roundDown = num - num%nextPower;
        int roundUp =roundDown + nextPower;

        int digit = num/powerOF10%10;
        if(digit < 2){
            return roundDown/10;
        }else if(digit == 2){
            return roundDown/10+right+1;
        }else {
            return roundUp /10;
        }
    }
}
