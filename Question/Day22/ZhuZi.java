package Day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZhuZi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String aim = sc.nextLine();
            String my = sc.nextLine();
            ContainsAim(aim,my);
        }
    }
    public static void ContainsAim(String aim,String my){
        if(aim == null || my == null){
            return;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i =0;i<aim.length();i++){
            char a = aim.charAt(i);
            if(map.get(aim.charAt(i)) == null){
                map.put(a,1);
            }else {
                int count = map.get(a);
                map.put(a,++count);
            }
        }
        boolean result = true;
        int count=0;
        for (int i = 0;i<my.length();i++){
            char c = my.charAt(i);
            if(map.get(c) == null){
                count++;
                result = false; //处理没有的情况
            }else {
                int tmp = map.get(c);
                tmp--;
                if(tmp < 0){
                    result = false; //处理珠子少的情况
                    count++;
                }
                map.put(c,tmp);
            }
        }
        if(!result){
            System.out.println("No "+count);
            return;
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            count += entry.getValue();
        }
        System.out.println("Yes "+count);
    }
}
