package Day36;

import java.util.Scanner;

public class xToH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String num = sc.nextLine();
            xTurnToH(num);
        }
    }

    private static void xTurnToH(String num) {
        if(num == null){
            return;
        }
        // A10 B11 C12 D13 E14 F15
        int result = 0;
        char tmp = '0';
        int index = 0;
        for (int i=num.length()-1; i>1; i--){
            tmp = num.charAt(i);
            if(tmp >= '0' && tmp <= '9'){
                result += ((int)tmp - '0' )*(int)Math.pow(16.0,index);
                index++;
                continue;
            }
            result +=(int)Math.pow(16.0,index) * ((int)tmp - 55);
            index++;
        }
        System.out.println(result);
    }
}
