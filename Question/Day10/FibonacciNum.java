package Day10;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            FindMinStep(num);
        }

    }
    private static void FindMinStep(int num){
        if(num < 1 || num >1000000){
            return;
        }
        int frot=0;
        int last=0;
        for (int i=0;i<=num+1;i++){
            frot = FiBon(i);
            last = FiBon(i+1);
            if(num > frot && num <=  last){
                System.out.println(Math.min(num-frot,last-num));
                return;
            }
        }
    }
    private static int FiBon(int i){
        if(i <=1){
            return i;
        }
        int a1 = 0;
        int a2 = 1;
        int result=0;
        for (int j=2;j<=i;j++){
            result = a1+a2;
            a1=a2;
            a2=result;
        }
        return result;
    }
}
