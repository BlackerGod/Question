package Day21;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String password = sc.nextLine();
            TranPass(password);
        }
    }


    private static void TranPass(String password){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<password.length();i++){
            char tmp = password.charAt(i);
            if(tmp == ' '){
                sb.append(tmp);
                continue;
            }
            if(tmp - 5 < 'A'){
                int index = 4 - (tmp - 'A');
                sb.append((char)('Z' - index));
            }else {
                sb.append((char)(tmp-5));
            }
        }
        System.out.println(sb.toString());
    }
}
