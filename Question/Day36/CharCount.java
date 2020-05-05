package Day36;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {
    static HashMap<Character,Integer> map = new HashMap<>(26);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init();
        while (sc.hasNext()){
            String str = sc.nextLine();
            PrintCount(str);
            Clear();
        }
    }
    private static void Clear(){
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            entry.setValue(0);
        }
    }
    private static void Init(){
        char a = 'A';
        for (int i=0; i<26; i++){
            a = (char)('A'+ i);
            map.put(a,0);
        }
    }
    private static void PrintCount(String str) {
        if(str == null){
            return;
        }
        for (int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) != null){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
