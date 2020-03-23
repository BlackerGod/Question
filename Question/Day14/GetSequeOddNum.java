package Day14;

import java.util.Scanner;

public class GetSequeOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(GetSequeIddnum(num));
      //  }
    }

    private static String GetSequeIddnum(int num){
        if(num < 1 || num >100){
            return null;
        }
        int[] result = new  int[num];
        int num_sum = num * num * num;
        for(int i = 1;i <= 1000000;i+=2){
              int tmp = i;
              int sum = 0;
            for (int j = 0;j < num ; j++){
                result[j] = tmp;
                tmp +=2;
                sum += result[j];
            }
            if(sum == num_sum){
                StringBuilder fin = new StringBuilder();
                for (int k = 0;k<num;k++){
                    fin.append(result[k]);
                    if(k != num-1){
                        fin.append("+");
                    }
                }
                return fin.toString();
            }
        }
        return null;
    }
}
