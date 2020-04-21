package Day29;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[][] tmp = new int[pow(n)][n];
            Init(tmp,n);
            int[] arr =new int[n];
            for (int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            DiffCount(n,arr,sum);
        }
    }

    private static void DiffCount(int n, int[] arr,int sum) {


    int[][] tmp = new int[pow(n)][n];
    Init(tmp,n);
        Arrays.sort(arr);
    int result = 0;
    for (int i = 0;i<pow(n);i++){
        int row = 0;
        for (int j = 0;j<n;j++){
            row += (arr[j] * tmp[i][j]);
            if(row > sum){
                break;
            }
        }
        if(row == sum){
            result++;
        }
    }
        System.out.println(result);
    }

    private static void Init(int[][] tmp,int n){
        for (int i = 0;i<pow(n);i++){
            for (int j = 0;j<n;j++){
                tmp[i][j] = 0;
            }
        }

        for (int i=1;i<pow(n);i++){
            int index = n-1;
            for (int j = i;j > 0;j /= 2){
                tmp[i][index] = j % 2;
                index--;
            }
        }
    }
    private static int pow(int x){
        int sum = 1;
        for (int i=0;i<x;i++){
            sum *= 2;
        }
        return sum;
    }
}
