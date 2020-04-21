package Day29;

import java.util.Scanner;

public class PriceGate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count = scanner.nextInt();
            Gate(count);
        }
    }

    private static void Gate(int count) {
        if(count < 2 || count >20){
            return;
        }
        double sum = 1;
        for (int i = 1;i<=count;i++){
            sum *=  i;
        }
         System.out.println(sum);
        System.out.println(D(count));
        float result = (float)(D(count)/sum) * 100;
        System.out.printf("%.2f",result);
        System.out.println("%");
    }

    private static long D(int n){
        // 错排
        if(n == 1 ){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return (n-1)*(D(n-2)+D(n-1));
    }
}
