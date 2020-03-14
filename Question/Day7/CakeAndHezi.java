package Day7;

import java.util.Scanner;

public class CakeAndHezi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        MaxCakeCount(W,H);
    }
    private static void MaxCakeCount(int W,int H){
        int count = 0;

        //只要有一个是4的倍数，那么这个方程块一般是可以放，一半放不了
        if(W%4 == 0 || H%4==0){
            count = W*H/2;
        }else if(W%2 ==0 && H%2==0){
            count = (W*H/4+1)*2;
        }else {
            count = W*H/2+1;
        }

        System.out.println(count);
    }


}
