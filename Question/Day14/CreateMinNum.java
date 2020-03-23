package Day14;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[50];
        int useful_index = 0;
        for (int i = 0; i< 10 ;i++){
            int tmp = sc.nextInt();
            for(int z = 0;z < tmp ; z++){
                input[useful_index] = i;
                useful_index++;
            }
        }
        createMinNum(input,useful_index);
    }

    private static void createMinNum(int[] input, int useful_index){
        if(input == null){
            return;
        }
        int[] tmp = new int[useful_index];
        for(int i = 0 ; i<useful_index;i++){
            tmp[i] = input[i];
        }
        Arrays.sort(tmp);
        StringBuilder result = new StringBuilder();
        int zeroStart = 0;
        for (int i =0;i<useful_index;i++){
            if(tmp[i] == 0){
                zeroStart++;
            } else {
                break;
            }
        }
        result.append(tmp[zeroStart]);
        for(int j = 0 ;j <zeroStart ;j++){
            result.append("0");
        }
        for (int j = zeroStart+1; j<useful_index;j++){
            result.append(tmp[j]);
        }
        System.out.println(result.toString());
    }
}
