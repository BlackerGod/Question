package Day23;

import java.util.Scanner;

public class Anum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i=0;i<num;i++){
                arr[i] = sc.nextInt();
            }
            Print(arr,num);
        }
    }

    private static void Print(int[] arr, int num) {
        int A1 = 0;//整除5且是偶数
        int A2 = 0;//余1交错+ -
        int A3 = 0;//余2个数
        double A4 = 0.0;//余3平均数
        int A5 = 0;//余4max
        for (int i = 0;i<num;i++){
            if((arr[i] % 5 == 0) && (arr[i] % 2 == 0)){
                A1 +=arr[i];
            }
        }
        boolean flag = false;
        int j=0;
        for (int i = 0;i<num;i++){
            if(arr[i] % 5 == 1){
                A2 += arr[i] * pow(j++);
                flag = true;
            }
        }
        for (int i = 0;i<num;i++){
            if(arr[i] % 5 == 2){
                A3++;
            }
        }
        int a4count=0;
        for (int i = 0;i<num;i++){
            if(arr[i] % 5 == 3){
                A4 += arr[i];
                a4count++;
            }
        }
        for (int i = 0;i<num;i++){
            if((arr[i] % 5 == 4) && arr[i] > A5){
                A5 = arr[i];
            }
        }
        if(a4count != 0){
            A4 = A4/a4count;
        }
        PrintAllNum(A1,A2,flag,A3,A4,A5);
    }

    private static void PrintAllNum(int a1, int a2,boolean flag, int a3, double a4, int a5) {
    if(a1 == 0){
        System.out.print("N ");
    }else {
        System.out.print(a1+" ");
    }
        if(!flag){
            System.out.print("N ");
        }else {
            System.out.print(a2+" ");
        }

        if(a3 == 0){
            System.out.print("N ");
        }else {
            System.out.print(a3+" ");
        }

        if(a4 == 0){
            System.out.print("N ");
        }else {
            System.out.print(String.format("%.1f",a4)+" ");
        }
    if(a5 == 0){
            System.out.print("N ");
        }else {
            System.out.print(a5);
        }

    }

    private static int pow(int x){
        if(x % 2 == 0){
            return 1;
        }
        return -1;
    }
}
