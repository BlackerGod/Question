package Day13;

import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            AddLongInteger(A, B);
        }
    }

        public static String AddLongInteger(String addend, String augend){
            if(addend == null || augend == null){
                return null;
            }
            String max ;
            String min ;
            if(addend.length() > augend.length()){
                max = addend;
                min = augend;
            }else {
                max = augend;
                min = addend;
            }
            int[] result = new int[max.length()+1];
            int index = 1;
            for (int i=0;i<max.length();i++){
                result[index] = max.charAt(i)-'0';
                index++;
            }

            for (int i = min.length()-1;i>=0;i--){
                result[index-1] += (min.charAt(i)- '0');
                index--;
            }
            //累加结束，开始进位

            for (int i =result.length-1;i>0;i--){
                if(result[i] >= 10){
                    result[i] = result[i] -10;
                    result[i-1] +=1;
                }
            }

            StringBuilder tmp = new StringBuilder();
            int fron = 0;
            if(result[0] == 0){
                fron = 1;
            }
            for (;fron < result.length;fron++){
                tmp.append(result[fron]);
            }
            System.out.println(tmp.toString());
            return tmp.toString();
        }


}
