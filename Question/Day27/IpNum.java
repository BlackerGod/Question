package Day27;

import java.util.Scanner;

public class IpNum {

    /**
     * 关键再于，ip地址是32位，不能使用int
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String ip = sc.nextLine();
            String num = sc.nextLine();
            TurnTo(ip,num);
        }
    }

    private static void TurnTo(String ip, String num) {
        if(ip == null || num == null){
            return;
        }
        StringBuilder tmp = new StringBuilder();
        String[] result = ip.split("\\.");
        for (int i =0;i<result.length;i++){
            String a = change(result[i],0);
            tmp.append(a);
        }
        System.out.println(tmp.toString());
        System.out.println(erToZheng(tmp.toString()));



        String tmp2 = change(num,1);
        System.out.println(tmp2);
        tmp = new StringBuilder();
       // 0-7 8-15 16-23 24-31
        for (int i = 0;i<32;i+=8){
            String b =tmp2.substring(i,i+8);
            System.out.println(b);
            String c = String.valueOf(erToZheng(b));
            System.out.println(c);
            tmp.append(erToZheng(b)+".");
        }
        System.out.println(tmp.toString());
        System.out.println(tmp.toString().substring(0,tmp.toString().length()-1));
    }
    private static String change(String num,int choose){
        StringBuilder sb = new StringBuilder();

        for (long i = Long.parseLong(num);i>0;i/=2){
            sb.append(i%2);
        }
        if(choose == 0) {
            for (int i = sb.length(); i < 8; i++) {
                sb.append(0);
            }
        }
        if(choose == 1){
            for (int i = sb.length(); i < 32; i++) {
                sb.append(0);
            }
        }

        return sb.reverse().toString();
    }

    private static long erToZheng(String num){
        long result = 0;
        int index = 0;
        for (int i=num.length()-1;i>=0;i--){
            int tmp = num.charAt(i)-'0';
            result += pow(index) * tmp;
            index++;
        }
        return result;
    }
    private static long pow(int x){
        long sum = 1;
        for(int i =0;i<x;i++){
            sum = 2*sum;
        }
        return sum;
    }
}
//4294967295