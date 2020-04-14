package Day26;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Candidate {

    private static HashMap<String,Integer> hashMap = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
           int NUM = sc.nextInt();
            for (int i =0;i < NUM;i++){
                AddCandidate(sc.next());
            }
            int votes = sc.nextInt();
            for (int i=0;i<votes;i++){
                Vote(sc.next());
            }
            PrintCandidate();
            Clear();
        }
    }

    private static void PrintCandidate() {
        for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("Invalid : "+Invalid);
    }

    public static int AddCandidate(String name){
        if(name == null || hashMap.containsKey(name)){
            return 0;
        }
        hashMap.put(name,0);
        return 1;
    }
    static int Invalid = 0;
    public static void Vote(String name){
        if(hashMap.containsKey(name)){
            int count = hashMap.get(name);
            hashMap.put(name,++count);
        }else {
            Invalid++;
        }
    }
    public static void Clear(){
        hashMap = new HashMap<>();
        Invalid = 0;
    }

    public static int GetVoteResult(String name){
        if(hashMap.containsKey(name)){
            return hashMap.get(name);
        }
        return -1;
    }
}
