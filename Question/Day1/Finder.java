package Day1;

import java.util.Arrays;

public class Finder {

    public static int findKth(int[] a, int n, int K) {
       return quickHelper(a,0,n-1,K);
        //Arrays.sort(a);
       // return a[n-K];

    }
    private static int quickHelper(int a[],int left,int right,int k){
        if( left <= right){
            int partIndex = partition(a,left,right);
            if(partIndex == k-1){
                return a[partIndex];
            } else if(partIndex > k-1){
                return quickHelper(a,left,partIndex-1,k);
            } else {
                return quickHelper(a,partIndex+1,right,k);
            }
        }else {
            return -1;
        }

    }

    private static int partition(int[] arr,int left,int right){
        int baseIndex = right;
        int baseValue = arr[right];
        while (left < baseIndex){
            while (left < baseIndex && arr[left] >= baseValue){
                left++;
            }
            while (left < baseIndex && baseValue >= arr[baseIndex]){
                baseIndex--;
            }
            swap(arr,left,baseIndex);
        }
        swap(arr,left,right);
        return left;
    }
    private static void swap(int arr[],int left ,int right){
        int rmp = arr[left];
        arr[left] = arr[right];
        arr[right] = rmp;
    }
    public static void main(String[] args) {
        System.out.println(findKth(new int[]{1,3,2,2,5},5,3));
    }
}
