package Day29;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr =new int[n+1];
            int[][] dp = new int[n+1][sum+1];
            for (int i = 1;i<=n;i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0;i<=n;i++){
                dp[i][0] = 1;
            }
            for (int j = 1; j<= sum;j++){
                dp[0][j] = 0;
            }
            for (int i = 1;i<=n;i++){
                for (int j = 0;j<=sum;j++){
                    if(arr[i] <= j){
                        dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i]];
                    }else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][sum]);
        }
    }

}
