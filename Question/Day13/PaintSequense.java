package Day13;

import java.util.Scanner;

public class PaintSequense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            char def = sc.next().charAt(0);
            Paint(num,def);

    }

    private static void Paint(int num,char def){
        if(num <3 || num >20){
            return;
        }
        int raw;
        if(num % 2 == 0 ){
            raw = num/2;
        }else {
            raw = num/2+1;
        }
        for (int i=0;i<raw;i++){
            //第一行最后一行
            if(i == 0 || i == raw-1) {
                for (int j = 0; j < num; j++) {
                    System.out.print(def);
                }
                System.out.println();
            } else {
                //中间行
                System.out.print(def);
                for (int k=1;k<num-1;k++){
                    System.out.print(" ");
                }
                System.out.print(def);
                System.out.println();
            }

        }
    }
}
