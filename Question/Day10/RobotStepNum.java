package Day10;

import java.util.Scanner;

public class RobotStepNum {
    private static int result =0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(countWays(x, y));
            System.out.println(countWays2(x, y));
        }
    }
    public static int countWays2(int x, int y) {
        if(x <= 0 || y <=0){
            return 0;
        }
        if(x == 1 || y == 1){
            return 1;
        }
        return countWays2(x-1,y) + countWays2(x,y-1);
    }

    public static int countWays(int x, int y) {
       if(x+y > 12 || x == 0 || y == 0){
           return -1;
       }
       if(x == 1 || y == 1){
            return 1;
       }

       return Helper(0,0,x,y);

    }


    private static int Helper(int i,int j,int x,int y){
        if(i == x-1 && j == y-1){
            return 1;
        }
        if(i >= x || j >= y){
            return 0;
        }
        return Helper(i+1,j,x,y) + Helper(i,j+1,x,y);

    }
}
