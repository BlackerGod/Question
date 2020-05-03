package Day35;

public class Solution {
    public static void main(String[] args) {
        System.out.println(calculateMax(new int[]{3,8,5,1,7,8}));
    }

    public static int calculateMax(int[] prices) {
        if(prices.length == 2){
            return prices[0] + prices[1];
        }
        int result = 0;
        int tmp = 0;
        for (int i = 1; i<prices.length-1; i++){
            tmp = getMax(prices,0,i) + getMax(prices,i+1,prices.length-1);
            if(tmp > result){
                result = tmp;
            }
        }

        return result;
    }

    /**
     *
     * @param prices 原数组
     * @param start  区间开始下标
     * @param end    区间结束下标
     * @return
     */
    private static int getMax(int[] prices,int start,int end){
        int max = 0;
        int min = prices[start];
        for (int i=start+1; i<=end; i++){
            if(prices[i] - min > max){
                max = prices[i] - min;
            }
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return max;
    }
}
