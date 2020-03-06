package Day3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        LongString(result);
    }
    private static void LongString(String source){
        if(source == null){
            return;
        }
        int max=0;
        String result ="";
        for (int i=0;i<source.length();i++){
            if(source.charAt(i) >= '0' && source.charAt(i) <= '9'){
                StringBuilder tmp = new StringBuilder();

                for(int j=i;j<source.length();j++){
                    if(source.charAt(j) >= '0' && source.charAt(j) <= '9'){
                        tmp.append(source.charAt(j));
                    }else {
                            if(tmp.length() > max){
                                    max = tmp.length();
                                    result=tmp.toString();
                                    i=j;
                                    break;
                            }else {
                                i=j;
                                break;
                            }
                    }
                }
                if(tmp.length() > max){
                    result=tmp.toString();
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
