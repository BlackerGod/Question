package Day17;

import java.util.*;

public class TrainsSeqence {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            Stack<Integer> stack = new Stack<>();
            int N = sc.nextInt();
            int[] trains = new int[N];
            for (int i = 0; i < N;i++){
                trains[i] = sc.nextInt();
            }
            PrintTrains(trains,0,stack,"",0);
            Collections.sort(list);
            for (String str : list){
                System.out.println(str);
            }
        }
    }

    /**
     *
     * @param trains 输入的数组
     * @param i 为入栈的次数
     * @param stack 栈
     * @param str 一趟的结果
     * @param j 为出栈的次数
     */
    private static void PrintTrains(int[] trains,int i,Stack<Integer> stack,String str,int j) {
        if (j == trains.length ) {
            list.add(str);      //表明所有的火车全以出栈，结果保存；
        }
        if(!stack.isEmpty()){
            //栈不空就出栈
            int temp = stack.pop();
            PrintTrains(trains,i,stack,str+temp+" ",j+1);
            stack.push(temp);//恢复现场
        }
        if(i < trains.length){
            //如果没入栈就先入栈
            stack.push(trains[i]);
            PrintTrains(trains,i+1,stack,str,j);
            stack.pop();//恢复现场
        }

    }
}
