package Day5;

import java.util.Arrays;
import java.util.Scanner;

public class PackageCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] things = new int[count];
        for (int i=0;i<things.length;i++){
            things[i]=sc.nextInt();
        }
        chooseNum(things,count);

    }
    private static void chooseNum(int[] things,int index){
        int result = 0;
        int row =Pow(index);
        int[][] choose = new int[row][index];
        Init(choose,row,index);
        Arrays.sort(things);
        for(int i=1;i<row;i++){
            int sum = 0;
            for(int j=0;j<index;j++){
                sum += choose[i][j] *things[j];
                if(sum >40){
                    break;
                }
            }
            if(sum == 40){
                result++;
            }
        }
        System.out.println(result);

    }
    private static void Init(int[][] choose,int row ,int index){
        //先初始化0
        for (int i=0;i<row;i++){
            for(int j=0;j<index;j++){
                    choose[i][j] = 0;
            }
        }
        //初始化每一个表
        for(int i =1;i<row;i++){
            int x=i;
            int tmp = index;
            for(;x>0;x=x/2){
                choose[i][tmp-1] = x%2;
                tmp--;
            }
        }
    }
    private static int Pow(int y){
        int sum = 2;
        for(int i=1;i<y;i++){
            sum = sum *2;
        }
        return sum;
    }
}
