package Day15;

import java.util.Scanner;

public class FindBeiKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int place = sc.nextInt();
            minStep(place);
        }
    }

    private static void minStep(int place){

        //排除place为0的情况
        if(place % 1000000007 == 0){
            System.out.println(0);
            return;
        }

        //4*x + 3 是2*（2x+1）+1
        //4*x + 3 是2*（2*（2x+1）+1）+1

           int count = 0;
        //我们以（2x+1）为一步，count最大100000步数，那我们每次走（8x+7）相当于走三步，所以小于300000
           while (place != 0 && count <= 300000){//place为0则说明找到了；
               place = ((place << 1) +1) % 1000000007;
               //左边是走，当place小于1000000007就是他本身，大于了就等于过了一个1000000007，就相当于找下一个2000000014了
               count++;
           }
           //结果再走两步除以3，是为了一次多走一步。比如5 走2走3=走两次3
           int res = (count + 2)/3;

           if(res > 100000){
               System.out.println(-1);
           } else {
               System.out.println(res);
           }

    }

}
