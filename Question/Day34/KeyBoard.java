package Day34;
import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String yuan = sc.nextLine();
            String now = sc.nextLine();
            PrintBadKey(yuan,now);
        }
    }

    private static void PrintBadKey(String yuan, String now) {
        if(yuan == null){
            return;
        }
        yuan = yuan.toUpperCase();
        now = now.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<yuan.length(); i++){
            if(!now.contains(String.valueOf(yuan.charAt(i)))){
                if(sb.indexOf(String.valueOf(yuan.charAt(i))) == -1){
                    sb.append(yuan.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}
