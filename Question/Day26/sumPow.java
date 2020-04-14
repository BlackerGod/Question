package Day26;

import java.util.Scanner;

public class sumPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();

            Prin(num);
        }
    }

    private static void Prin(int num) {
        int sum = 0;
        for (int i = num;i > 0;i=i/10){
            sum += (i%10);
        }
        int sum2 = 0;
        for (int j = num*num;j > 0;j=j/10 ){
            sum2 += (j%10);
        }
        System.out.println(sum+" "+sum2);
    }
}
