package Day4;

import java.util.Scanner;

public class packageNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            BuyApple(num);
        }
    }
    private static void BuyApple(int num){
        if(num <1 || num >100){
            System.out.println("-1");
            return;
        }
        int min = 100;
        boolean flag = false;
        for(int i=0;i<=12;i++){
            for(int j=0;j<=16;j++){
                if(((8*i)+(j*6))== num && (i+j)<min){
                    min = i+j;
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("-1");
            return;
        }
        System.out.println(min);
    }
}
