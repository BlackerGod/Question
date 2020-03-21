package Day12;

import java.util.Arrays;

public class GrayCode {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGray2(2)));;
    }
    public static String[] getGray(int n) {
        if(n == 0){
            return null;
        }
        int length = pow(n);
        String[] result = new String[length];
        result[0] = "0";
        result[1] = "1";
        for (int i=2;i<length;i*=2){
            int index = i-1;
            for(int j = i;j < i*2 && index < i;j++){
                result[j] = result[index];
                index--;
            }
            int tmp = i;
            for (int z = 0;z < i;z++){
                result[z] = "0" + result[z];
                result[tmp] = "1" + result[tmp];
                tmp++;
            }
        }
        return result;

    }
    private static int pow(int x){
        if(x == 0){
            return 1;
        }
        int result = 1;
        for (int i=1;i<=x;i++){
            result *= 2;
        }
        return result;
    }


    public static String[] getGray2(int n){
        String[] grayCodeArr = new String[pow(n)];
        if(n < 1){
            return null;
        }
        if(n == 1){
            grayCodeArr[0] = "0";
            grayCodeArr[1] = "1";
            return grayCodeArr;
        }
        String[] before = getGray2(n-1);
        for(int i=0;i<before.length;i++){
            grayCodeArr[i] = "0"+before[i];
            grayCodeArr[grayCodeArr.length-1-i] = "1" + before[i];
        }
        return grayCodeArr;
    }
}
