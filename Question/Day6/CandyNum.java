package Day6;

import java.util.Scanner;

public class CandyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[4];
        for (int i=0;i<4;i++){
            result[i] = sc.nextInt();
        }
        PrintChildCandy(result);
    }

    /**
     * 1.A-B     1.4  A+C
     * 2.B-C     2.3  A+C
     * 3.A+B
     * 4.B+C
     * @param result
     */
    private static void PrintChildCandy(int[] result){
        if(result.length <4){
            System.out.println("No");
        }
        int A,B,C;
        A = (result[0]+result[2])/2;
        B = (result[1]+result[3])/2;
        C = (result[0] +result[3])-A;
        if(A<0 || B<0 ||C<0){
            System.out.println("No");
        }
        if((A+B) == result[2] && (B+C) ==result[3]
                && (A-B) ==result[0] &&(B-C) == result[1]){
            System.out.printf("%s %s %s",A,B,C);
            return;
        }
        System.out.println("No");
    }
}
