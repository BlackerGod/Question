package Day33;

import java.util.Scanner;

public class GoUpstairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(countWays(num));
        }
    }
    public static int countWays(int n) {
        int[] res = new int[]{1,2,4};
        if(n < 4){
            return res[n-1];
        }
        int tmp = 0;
       // A[n-1] + A[n-2] +A[n-3]
        for (int i=4; i<=n; i++){
            tmp = ((res[0] + res[1])%1000000007 + res[2])%1000000007;
            res[0]  = res[1];
            res[1] = res[2];
            res[2] = tmp;
        }
        return res[2];
    }



}
