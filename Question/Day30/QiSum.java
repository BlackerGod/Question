package Day30;

import java.util.Scanner;

public class QiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            JiSum(str);
        }
        sc.close();
    }

    private static void JiSum(String str) {
        for (int i=0; i<str.length(); i++){
          String tmp = ErJin(str.charAt(i));
          int count = 0;
          for (int j=0; j<tmp.length();j++){
              if(tmp.charAt(j) == '1'){
                  count++;
              }
          }
            if(count % 2 != 0){
                tmp = "0" + tmp;
            }else {
                tmp = "1" + tmp;
            }
            System.out.println(tmp);
        }
    }

    private static String ErJin(char charAt) {
        StringBuilder sc = new StringBuilder();
        for (int i = (int)charAt; i>0; i/=2){
            sc.append(i%2);
        }
        if(sc.length() < 7){
            for (int j = 7-sc.length(); j>0;j--){
                sc.append("0");
            }
        }
       return sc.reverse().toString();
    }
}
