package Day2;

import java.util.Arrays;

public class AntiOrder {

    public static int count(int[] A,int n){
        int num = 0;
        for (int i = 0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(A[i] > A[j]){
                    num++;
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(count(new int[]{1,2,3,7,5,6,4,0},8));;
    }
}
