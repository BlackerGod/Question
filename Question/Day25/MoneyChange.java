package Day25;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String money = sc.nextLine();
            Turnprint(money);
        }
    }

    /*private static void TurnPrint(String money) {
        if ("0.00".equals(money)){
            System.out.println("人民币零元");
            return;
        }

        StringBuilder sb = new StringBuilder("人民币");
        String[] choose = new String[]{"元","拾","佰","仟","万","拾","佰","仟","亿","拾","佰","仟","万","兆","拾","佰","仟","亿"};
        char[] num = new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖','拾','仟','万','亿'};
        String preNum = money.substring(0,money.indexOf('.'));
        String hidNum = money.substring(money.indexOf('.')+1);
        if(hidNum.charAt(0) == '0' && hidNum.charAt(1) == '0'){
            hidNum = "整";
        } else {
            char jiao = num[(hidNum.charAt(0) - '0')];
            char fen = num[(hidNum.charAt(1) - '0')];
            hidNum = jiao + "角" + fen + "分";
        }
        int index = preNum.length()-1;
        for (int i = 0;i<preNum.length();i++){
            int c = (preNum.charAt(i) - '0');
            //10001
            if(c == 0){

                int j = i;
                for (;j<preNum.length();j++){
                    int b = (preNum.charAt(j) - '0');
                    if(b == 0){
                        if(index == 8){
                            sb.append("亿");
                        }
                        if(preNum.charAt(j-1) != '0' && index == 4){
                            sb.append("万");
                        }
                        index--;

                    }else {
                        break;
                    }
                }
                sb.append(num[c]);
                if (j == preNum.length()-1){
                    sb.append(num[preNum.charAt(j) - '0']);
                    break;
                }
                i = j;
                continue;
            }
            sb.append(num[c]+choose[index]);
            index--;
        }
        if(sb.charAt(sb.length()-1) != '元'){
            sb.append("元");
        }
        sb.append(hidNum);
        if(preNum.length() == 6 && sb.charAt(3) == '壹'){
            System.out.println("人民币"+sb.toString().substring(4));
            return;
        }
        System.out.println(sb.toString());
    }*/

    static char[] num = new char[]{'零','壹','贰','叁','肆','伍','陆','柒','捌','玖','拾','佰','仟','万','亿'};
    private static void Turnprint(String money){
        StringBuilder sb = new StringBuilder("人民币");
        String preNum = money.substring(0,money.indexOf('.'));
        String hidNum = money.substring(money.indexOf('.')+1);
        long n = Long.valueOf(preNum);
        if(n > 0){
            convert(n,sb);
            sb.append("元");
        }

        if(hidNum.charAt(0) == '0' && hidNum.charAt(1) == '0'){
            hidNum = "整";
        } else {
            int jiao = (hidNum.charAt(0) - '0');
            int fen =  (hidNum.charAt(1) - '0');
            if(jiao != 0){
                sb.append(num[jiao] + "角");
            }
            if(fen != 0){
                sb.append(num[fen] + "分");
            }
        }

        System.out.println(sb.toString());

    }
    private static void convert(long n, StringBuilder builder) {
        // 大于一亿
        if (n >= 1_0000_0000) {
            long q = n / 1_0000_0000;
            long r = n % 1_0000_0000;

            convert(q, builder);
            builder.append('亿');

            // 是亿的整数倍
            if (r != 0) {
                convert(r, builder);
            }
        }
        // 大于一万
        else if (n >= 1_0000) {
            long q = n / 1_0000;
            long r = n % 1_0000;

            convert(q, builder);
            builder.append('万');

            // 是亿的整数倍
            if (r != 0) {

                if (r < 100) {
                    builder.append('零');
                }

                convert(r, builder);
            }
        }
        // 大于一千
        else if (n >= 1000) {
            long q = n / 1000;
            long r = n % 1000;

            convert(q, builder);
            builder.append('仟');

            // 是亿的整数倍
            if (r != 0) {

                if (r < 100) {
                    builder.append('零');
                }

                convert(r, builder);
            }
        }
        // 大于一百
        else if (n >= 100) {
            long q = n / 100;
            long r = n % 100;

            convert(q, builder);
            builder.append('佰');

            // 是亿的整数倍
            if (r != 0) {

                if (r < 10) {
                    builder.append('零');
                }

                convert(r, builder);
            }
        }
        // 大于十
        else if (n >= 10) {
            long q = n / 10;
            long r = n % 10;

            if (q > 1) {
                convert(q, builder);
            }
            builder.append('拾');

            // 是亿的整数倍
            if (r != 0) {
                convert(r, builder);
            }

        } else {
            builder.append(num[(int) n]);
        }
    }
}
