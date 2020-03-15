package Day8;

import java.util.Scanner;
public class CircleDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int index = sc.nextInt();
            LastIndex(index);
        }
    }
    private static void LastIndex(int index){
        if(index <= 0){
            return;
        }
        int[] result = new int[index];
        for (int i = 0;i<index;i++){
            result[i] = i;
        }
        int TrueSize = index;
        int step = 0;
        int lastIndex = 0;
        int i=0;

        //-1为标记的数
        while (TrueSize != 0){
            if(result[i] != -1){
                if(step++ == 2){
                    result[i] = -1;
                    TrueSize--;
                    lastIndex = i;
                    step=0;
                }
            }
            i = (i+1) % index;
        }
        System.out.println(lastIndex);
    }

}
