package Day15;

public class UnusualAdd {
    public static void main(String[] args) {
        System.out.println(addAB3(1,2));
    }
    public static int addAB(int A, int B) {
        if(A == 0){
            return B;
        }
        if(B == 0){
            return A;
        }
        int tmp1 ;
        int tmp2 ;
        tmp1 = A ^ B;
        tmp2 = (A & B)<<1;
        return addAB(tmp1,tmp2);
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int addAB2(int a,int b){
        return b == 0 ? a : addAB2(a ^ b,(a & b) << 1);
    }
    /*
    *
    * 在二进制中的加法有如下规律：
      0 + 0 = 0, 0 + 1 = 1, 1 + 0 = 1, 1 + 1 = 10
其中1 + 1比较特殊，结果为10，需要进位。如果暂时先不考虑进位，那么1 + 1当前位结果为0，也就是说：
0 + 0 = 0, 0 + 1 = 1, 1 + 0 = 1, 1 + 1 = 0
这个结果是不是很熟悉？对的，这就是异或操作的结果。所以对于同位，我们可以使用异或操作来进行计算：int xor = a ^ b;
*/

    /*
    *
    * 接下来我们再考虑进位。二进制中，只有在两个数都为1时，才会产生进位，所以这里需要用逻辑与操作。而进位本身这个动作我们可以用左移来实现：int conj = (a & b) << 1;
    * */
    public static int addAB3(int a,int b){
        int tmp1  = 0;
        while (b != 0){
            tmp1 = (a ^ b); // 找出加后各个位数的情况（即不考虑进位）
            b = (a&b)<<1;//找出进位的情况（只考虑进位） 这两步同时发生，所以需要额外的空间
            a = tmp1;
        }
        return a;
    }
}
