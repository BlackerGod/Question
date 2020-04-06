package Day21;

import java.util.Scanner;

public class Rabit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int mouth = sc.nextInt();
            System.out.println(getTotalCount(mouth));
        }
    }
    public static int getTotalCount(int mouthCount){
        if(mouthCount <= 2){
            return 1;
        }
        int a1 = 1;
        int a2 = 1;
        int a3 = 0;
        for (int i = 2;i<mouthCount;i++){
            a3 = a1+a2;
            a1 = a2;
            a2 = a3;
        }
        return a3;
    }

}
