package Day3;

import java.util.Scanner;

public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        if(A == null || n <=1){
            return false;
        }

        int right=0;
       for(int i = 0;i<n;i++){
           boolean flag =false;
           if(A.charAt(i) == '('){
               while (right<n){
                   if(A.charAt(right) == ')'){
                        flag =true;
                        right++;
                        break;
                   }else {
                       right++;
                   }
               }
               if(!flag){
                   return false;
               }
           }
       }
       if(right != n){
           return false;
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String result = sc.nextLine();
        System.out.println(chkParenthesis(result,result.length()));
    }
}
