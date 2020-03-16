package Day9;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverseNum(num);
    }
    private static void reverseNum(int num){
        if(num <= 9){
            System.out.println(num);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        System.out.println(sb.reverse());
    }
}
