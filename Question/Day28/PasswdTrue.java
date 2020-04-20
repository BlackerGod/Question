package Day28;

import java.util.HashMap;
import java.util.Scanner;

public class PasswdTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String password = scanner.nextLine();
            if(isPassword(password)){
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    private static boolean isPassword(String password) {
        if(password.length() <= 8){
            return false;
        }
        int[] ch = new int[4];
        for (int i =0;i<password.length();i++){
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                ch[0] += 1;
            }else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                ch[1] += 1;
            } else if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                ch[2] += 1;
            }else {
                ch[3] += 1;
            }
        }
        int count = 0;
        for (int i = 0;i<4;i++){
            if(ch[i] != 0){
                count++;
            }
        }
        if(count < 3){
            return false;
        }


        for (int i =0;i<password.length()-3;i++){
            if(password.substring(i+1,password.length()).contains(password.substring(i,i+3))){
                return false;
            }
        }
        return true;
    }
}
