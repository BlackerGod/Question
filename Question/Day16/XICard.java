package Day16;

import java.util.Arrays;
import java.util.Scanner;

//3
// 3 1   1 2 3 4 5 6
// 3 2   1 2 3 4 5 6
// 2 2   1 1 1 1
public class XICard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while (t-- !=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int value[] = new int[2*n];
            for (int i =0;i<2*n;i++){
                value[i] = sc.nextInt();
            }
            //int tmp[]=
            getResult(n,k,value);
//            if(t == 0){
//                Print2(tmp);
//            }else {
//                Print1(tmp);
//            }
        }
    }
    //1 4 2 5 3 6 1 5 4 3 2 6 1 1 1 1
    private static void getResult(int n, int k, int[] value) {
        int tmp[];
        while (k-- > 0){
            tmp= Arrays.copyOf(value,value.length);
            for (int i = 0;i<n;i++){
                value[2*i] = tmp[i];
                value[2*i+1] = tmp[i+n];
            }
        }
        for (int i=0;i<value.length;i++){
            if(i == value.length-1){
                System.out.println(value[i]);
                return;
            }else {
                System.out.print(value[i] + " ");
            }
        }
        //return value;
    }
//    private static void Print1(int [] value){
//        for (int i=0;i<value.length;i++){
//            System.out.print(value[i] + " ");
//        }
//    }
//    private static void Print2(int [] value){
//        for (int i=0;i<value.length;i++){
//            if(i == value.length-1){
//                System.out.print(value[i]);
//                return;
//            }else {
//                System.out.print(value[i] + " ");
//            }
//        }
//    }
}
