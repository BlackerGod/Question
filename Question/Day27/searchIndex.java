package Day27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i =0;i<num;i++){
                arr[i] = sc.nextInt();
            }
            int aim = sc.nextInt();
            for (int i=0;i<num;i++){
                if(aim == arr[i]){
                    System.out.println(i);
                    return;
                }
            }
            System.out.println("-1");
        }
    }
}
