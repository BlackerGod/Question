//package Day30;
//
//import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collections;
//
//class LengthNum implements Comparable{
//    public String num ;
//
//    public LengthNum(String num) {
//        this.num = num;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        LengthNum tmp = (LengthNum)o;
//        return this.num.length() - tmp.num.length();
//    }
//}
//public class LengthNumSort {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (sc.hasNextInt()){
//            int N = sc.nextInt();
//            List<LengthNum> nums = new ArrayList<>();
//
//            for (int i=0; i<N; i++){
//                nums.add(new LengthNum(sc.next()));
//            }
//            Collections.sort(nums); //比较有序
//
//            DetailSort(nums,N);
//
//            for(int i=0; i<N; i++){
//                System.out.println(nums.get(i).num);
//            }
//
//        }
//    }
//
//    private static void DetailSort(List<LengthNum> nums, int N) {
//
//        for (int i=0; i<N;i++){
//            // 1.找到长度一致的起始下标和终止下标
//            int start = i;
//            int end = i;
//
//            for (;end<N;){
//                if(nums.get(start).num.length() == nums.get(end).num.length()){
//                    end++;
//                }else {
//                    break;
//                }
//            }
//            System.out.println(start);
//            System.out.println(end);
//            if(start == end){
//                continue;
//            }
//            // 3.进行排序(插排)
//            int tmp = start;
//            for (;start < end-1; start++){
//                for (int j=start+1; j>0; j--){
//                    // 2.比较大小
//                    if(isMax(nums,j-1,j)){
//                        swap(nums,j-1,j);
//                    }else {
//                        break;
//                    }
//                }
//            }
//
//            i = end-1;
//        }
//    }
//
//    private static boolean isMax(List<LengthNum> nums,int x, int y){ // x 是否大于 y
//
//        if(nums.get(x).num.length() > nums.get(y).num.length()){
//            return true;
//        }
//        for (int i =0; i<nums.get(x).num.length();i++){
//            if(nums.get(x).num.charAt(i) - '0' < nums.get(y).num.charAt(i) - '0'){
//                return false;
//            }
//        }
//        return true;
//    }
//    private static void swap(List<LengthNum> nums,int x, int y){
//        LengthNum tmp = nums.get(x);
//        nums.set(x,nums.get(y));
//        nums.set(y,tmp);
//    }
//}
