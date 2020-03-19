package Day11;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] tmp = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(multiply(tmp)));
    }

    public static int[] multiply(int[] A) {
        if(A.length == 0){
            return null;
        }
        int[] result = new int[A.length];
        for (int index = 0;index<result.length;index++){
            result[index] =1;
        }
        for(int i = 0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                if(j != i){
                    result[i] *= A[j];
                }

            }
        }
        return result;
    }
}
