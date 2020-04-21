package Day29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()){
                int n = sc.nextInt();
                int sum = sc.nextInt();
                int[] arr =new int[n];
                for (int i = 0;i<n;i++){
                    arr[i] = sc.nextInt();
                }
                DiffCount(n,arr,sum);
            }
        }

        private static void DiffCount(int n, int[] arr,int sum) {
            int result = 0;
            Sort(arr);
            for (int i = 1;i <= arr.length;i++){
                result += Helper(arr,i,sum,0);
            }
            System.out.println(result);
        }


    private static int Helper(int[] arr,int i,int sum, int index) {
        int count = 0;
        if(i == 0){
            return sum == 0 ?1:0;
        }
        for (int j = index;j <= arr.length-i;j++){
            if(arr[j] <= sum){
                count += Helper(arr,i-1,sum-arr[j],j+1);
            }
        }
        return count;
    }

    private static void Sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j= i+1;j>0;j--){
                if(arr[j] > arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
    }

}
