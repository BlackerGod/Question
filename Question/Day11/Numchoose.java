package Day11;

import java.util.Scanner;

public class Numchoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String num = sc.nextLine();
            NumCi(num);

        }
    }
    private static void NumCi(String num){
        if(num.length() >1000){
            return;
        }
        int[] result = new int[1000];
        for(int i= num.length()-1;i>=0;i--){
            result[num.charAt(i)-'0']++;
        }
        for(int j=0;j<1000;j++){
            if(result[j] != 0 ){
                System.out.println(j+":"+result[j]);
            }
        }
    }
}
