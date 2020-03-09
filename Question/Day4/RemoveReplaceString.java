package Day4;

import java.util.Scanner;

public class RemoveReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        RepalceString(A,B);
    }
    private static void RepalceString(String A, String B){
        if(A == null || B == null || A.length() < B.length()){
            return;
        }
        StringBuilder result = new StringBuilder();

        for(int i=0;i<A.length();i++) {
            char tmp = A.charAt(i);
            boolean flag = false;
            for (int j = 0; j < B.length(); j++) {
                if (tmp != B.charAt(j)) {
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
            if(flag){
                result.append(tmp);
            }
        }
        System.out.println(result.toString());
    }
}
