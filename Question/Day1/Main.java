package Day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = rebackCount(a,b);
        System.out.println(result);
    }
    private static int rebackCount(String a, String b){
        int count=0;
        for(int i =0; i < a.length();i++){
            StringBuilder sc = new StringBuilder(a);
            sc.insert(i,b);
            if(isRebackNum(sc.toString())){
                count++;
            }
        }
        StringBuilder tmp = new StringBuilder(a+b);
        if(isRebackNum(tmp.toString())){
            count++;
        }
        return count;
    }
    private static boolean isRebackNum(String a){
       int left = 0;
       int rigth = a.length()-1;
       while (left < rigth){
           if(a.charAt(left) != a.charAt(rigth)){
               return false;
           }
           left++;
           rigth--;
       }
       return true;
    }
}
