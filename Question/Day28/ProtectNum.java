package Day28;

import java.util.Scanner;

public class ProtectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            if(protectnum(num)){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }

    private static boolean protectnum(int num) {
        if(num == 2 || num == 3){
            return false;
        }
        return num == Integer.valueOf(String.valueOf(num * num).substring(1,String.valueOf(num * num).length()));
    }
}
