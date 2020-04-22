package Day30;
import java.util.Scanner;

public class LengthNumSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int N = sc.nextInt();
            String[] nums = new String[N];

            for (int i=0; i<N; i++){
                nums[i] = sc.next();
            }
   //         swap(nums,0,1);
            DetailSort(nums,N);

            for(int i=0; i<N; i++){
                System.out.println(nums[i]);
            }

        }
    }

    private static void DetailSort(String[] nums, int N) {

        for (int i=0;i<N-1; i++){
            for (int j=i+1; j>0; j--){
                if(isMax(nums,j-1,j)){
                    swap(nums,j-1,j);
                }else {
                    break;
                }
            }
        }

    }

    private static boolean isMax(String[] nums,int x, int y){ // x 是否大于 y
        if(nums[x].length() > nums[y].length()){
            return true;
        }
        if(nums[x].length() < nums[y].length()){
            return false;
        }
        for (int i =0; i<nums[x].length();i++){
            if((nums[x].charAt(i) - '0') < (nums[y].charAt(i)- '0')){
                return false;
            } else if((nums[x].charAt(i) - '0') > (nums[y].charAt(i)- '0')){
                return true;
            }
        }
        return true;
    }
    private static void swap(String[] nums,int x, int y){
        String tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }

}
