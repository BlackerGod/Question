package Day32;

import java.util.Scanner;

public class HoliMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String money = sc.nextLine();
            PrintMoney(money);
        }
    }

    private static void PrintMoney(String money) {
        // 输入格式 G  S  k
        // 换算格式 29K =》S   17S =》 G
        if(money == null){
            return;
        }
        int[] result = new int[3];
        String[]tmp = money.split(" ");
        String[] supportPay = tmp[0].split("\\.");
        String[] truePay = tmp[1].split("\\.");

        if(Integer.parseInt(truePay[2]) - Integer.parseInt(supportPay[2]) >= 0){
                result[2] =Integer.parseInt(truePay[2]) - Integer.parseInt(supportPay[2]);
        } else {
                result[2] = (29+Integer.parseInt(truePay[2])) - Integer.parseInt(supportPay[2]);
                truePay[1] = String.valueOf(Integer.parseInt(truePay[1]) - 1);
        }

        if(Integer.parseInt(truePay[1]) - Integer.parseInt(supportPay[1]) >= 0){
            result[1] =Integer.parseInt(truePay[1]) - Integer.parseInt(supportPay[1]);
        } else {
            result[1] = (17+Integer.parseInt(truePay[1])) - Integer.parseInt(supportPay[1]);
            truePay[0] = String.valueOf(Integer.parseInt(truePay[0]) - 1);
        }
        result[0] = Integer.parseInt(truePay[0]) - Integer.parseInt(supportPay[0]);

        if(result[0] < 0){
            if(result[1] > 0 || result[2] > 0){
                result[0] += 1;
                result[1] = result[1] - 16;
                result[2] = result[2] - 29;
            }
            if(result[2] == -29){
                result[1] -= 1;
                result[2] = 0;
            }
            result[1] *= -1;
            result[2] *= -1;
        }

        System.out.println(result[0]+"."+result[1]+"."+result[2]);
    }
}
