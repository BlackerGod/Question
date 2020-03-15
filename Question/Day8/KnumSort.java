package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class KnumSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=0;
        int[] result = new int[100];
        while (sc.hasNext()){
            result[index] = sc.nextInt();
            index++;
        }
        PrinSortNum(result,index);
    }
    private static void PrinSortNum(int[] result, int index){
        int[] tmp = new int[index-1];
        for (int i=0;i<index-1;i++){
            tmp[i] = result[i];
        }
        Arrays.sort(tmp);
        for (int j=0;j<result[index-1];j++){
            System.out.println(tmp[j]);
        }
    }
}
