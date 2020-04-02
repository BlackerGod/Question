package Day20;

import java.util.HashMap;
import java.util.Map;

public class Gift {
    public static void main(String[] args) {
        System.out.println(getValue(new int[]{1,3,2,2,2},5));
    }
    public static int getValue(int[] gifts, int n) {

        HashMap<Integer,Integer> redbag = new HashMap<>();
        for (int i = 0; i<n;i++){
            if(redbag.isEmpty()){
                redbag.put(gifts[i],1);
                continue;
            }

            if(redbag.get(gifts[i]) == null){
                redbag.put(gifts[i],1);
            }else {
                int count = redbag.get(gifts[i]);
                redbag.put(gifts[i],++count);
            }
        }
        int length = n/2;
        for (Map.Entry<Integer,Integer> entry : redbag.entrySet()){
            if(entry.getValue() > length){
                return entry.getKey();
            }
        }
        return 0;
    }
}
