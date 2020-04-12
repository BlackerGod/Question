package Day24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] hp = new int[n];
            for (int i = 0;i<n;i++){
                hp[i] = sc.nextInt();
            }
            upgrade(a,hp);
        }
    }

    private static void upgrade(int a, int[] hp) {
        for (int i = 0;i < hp.length;i++){
            if(hp[i] <= a){
                a += hp[i];
            } else {
                int tmp = Max_Num(a,hp[i]);
                a += tmp;
            }
        }
        System.out.println(a);
    }

    private static int Max_Num(int a, int i) {
        for (int max = Math.max(a,i);max >=1;max--){
            if((a % max == 0) && (i % max == 0)){
                return max;
            }
        }
        return 1;
    }
}
