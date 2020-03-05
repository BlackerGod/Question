package Day2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int[] arr = new int[100];
        while (sc.hasNext()){
            arr[i] = sc.nextInt();
            i++;
        }
        for (int x = 0;x< i ;x++ ){
            BottleNum(arr[x]);
        }
    }

    private static void BottleNum(int bottle){
        int count = 0;
        if(bottle <= 1){
            System.out.println(0);
            return;
        }
        if(bottle == 2){
            System.out.println(1);
            return;
        }
        while (bottle >= 3 ){
            count += bottle/3;
            bottle = bottle/3+bottle%3;
        }
        if(bottle == 2){
            count++;
        }
        System.out.println(count);
    }
}
