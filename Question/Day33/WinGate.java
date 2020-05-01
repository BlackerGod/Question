package Day33;

import java.util.Scanner;

public class WinGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = Integer.parseInt(sc.nextLine());
            String[] tmp = new String[N];
            for (int i=0; i<N; i++){
                tmp[i] = sc.nextLine();
            }
            AnalyzeWin(N,tmp);
        }
    }
    private static void AnalyzeWin(int N,String[] tmp){
        int[] A = new int[3];
        int[] B = new int[3];
        String[] result = new String[2];
        String winner = null;
        //J B C
        int[] A_win = new int[3];
        int[] B_win = new int[3];

        for (int i=0; i<N; i++){
            result = tmp[i].split(" ");
            if(result[0].equals(result[1])){
                A[1] += 1;
                B[1] += 1;
                continue;
            }
            winner = Winner(result[0],result[1],A_win,B_win);
            if("A".equals(winner)){
                A[0] +=1;
                B[2] +=1;
            }else {
                A[2] +=1;
                B[0] +=1;
            }
        }
        System.out.println(A[0]+" "+A[1]+" "+A[2]);
        System.out.println(B[0]+" "+B[1]+" "+B[2]);
        System.out.print(PrintMaxGate(A_win)+" ");
        System.out.print(PrintMaxGate(B_win));
    }

    private static char PrintMaxGate(int[] a_win) {
        //J B C
        int max = -1;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<3; i++){
            if(a_win[i] > max){
                max = a_win[i];
            }
        }
        for (int j=0; j<3; j++){
            if(a_win[j] == max && j==0){
                sb.append("J");
            }else if(a_win[j] == max && j==1){
                sb.append("B");
            }else {
                sb.append("C");
            }
        }
        if(sb.length() == 1){
            return sb.toString().charAt(0);
        }
        int index = -1;
        for (int i=0; i<sb.length()-1; i++){
            if(sb.toString().charAt(i) < sb.toString().charAt(i+1)){
                index = i;
            }else {
                index = i+1;
            }
        }
        return sb.toString().charAt(index);
    }

    private static String Winner(String A, String B,int[] A_win,int[] B_win){
        //J B C
        if(A.charAt(0) == 'J' && B.charAt(0) == 'B'){
            A_win[0] +=1;
            return "A";
        }
        if(A.charAt(0) == 'J' && B.charAt(0) == 'C'){
            B_win[2] +=1;
            return "B";
        }
        if(A.charAt(0) == 'B' && B.charAt(0) == 'C'){
            A_win[1] +=1;
            return "A";
        }
        if(A.charAt(0) == 'B' && B.charAt(0) == 'J'){
            B_win[0] +=1;
            return "B";
        }
        if(A.charAt(0) == 'C' && B.charAt(0) == 'J'){
            A_win[2] +=1;
            return "A";
        }
        if(A.charAt(0) == 'C' && B.charAt(0) == 'B'){
            B_win[1] +=1;
            return "B";
        }
        return null;
    }
}
