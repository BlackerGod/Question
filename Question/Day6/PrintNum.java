    package Day6;

    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class PrintNum {
        public static void main(String[] args) {
//            Scanner sc= new Scanner(System.in);
//            int[] arr = new int[100];
//            int index=0;
//            while (sc.hasNext()){
//                arr[index] =sc.nextInt();
//                index++;
//            }
            int  arr[] = new int[]{2,2,3,3,3,3,3,3,4,5,8,9};
            printnum(arr,arr.length);
        }
        private static void printnum(int[] arr,int index){
            if(index == 0){
                return;
            }
            if(index == 1){
                System.out.println(arr[0]);
            }
            int[] result = new int[index];
            for(int i=0;i<index;i++){
                result[i] = arr[i];
            }
            Arrays.sort(result);
            int n = index/2;
            for(int i=0;i<index-1;i++){
                if(result[i] == result[i+1]){
                    int tmp = 1;
                    int j = i;
                    for(;j<index;j++) {
                        if(result[j] == result[j+1]){
                            tmp++;
                        }else {
                            break;
                        }
                    }
                    if(tmp >= n){
                        System.out.println(result[i]);
                    }
                    i=j;
                }
            }
        }
        private static void printnum2(int[] arr,int index){
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<index;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i],0);
                }else {
                    int num=map.get(arr[i]);
                     map.put(arr[i],++num);
                }
            }
            int n = index/2;
            for(Map.Entry<Integer,Integer> tmp : map.entrySet()){
                if(tmp.getValue()>=n){
                    System.out.println(tmp.getKey());
                }
            }
        }


    }
