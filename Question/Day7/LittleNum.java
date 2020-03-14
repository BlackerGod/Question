package Day7;

import java.util.Scanner;

public class LittleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        PrintLittleNum(A,B);
    }
    private static void PrintLittleNum(int A,int B){
        int result = A*B;
        int max = Math.max(A,B);
        for (int i=1;i<=max;i++){
            if((A * i)%B == 0 && (A * i) < result){
                result = A*i;
            }
        }
        System.out.println(result);
    }
}
