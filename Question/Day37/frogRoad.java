package Day37;

import java.util.*;

public class frogRoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
             n = sc.nextInt();
             m = sc.nextInt();
            int p = sc.nextInt();
            map = new int[n][m];
            for (int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    map[i][j] = sc.nextInt();
                }
            }
            frogFindRoad(p);
        }
    }
    static int[][] map;
    static  LinkedList<String> result = new LinkedList<>();
    static int n,m;
    static  int maxEnergy = 0;
    static  String path = "";
    static  boolean isEscape = false;

    private static void frogFindRoad(int p) {
        Helper(0,0,p);
        if(!isEscape){
            System.out.println("Can not escape!");
        }else {
            System.out.println(path);
        }

    }

    private static void Helper(int i, int j,int p) {
        if(p < 0 || i<0 || j<0 || i >= n || j >= m ||  map[i][j] == 0){
            return;
        }else {
                result.push("["+i+","+j+"]-");
                map[i][j] = 0;
                if(i == 0 && j == m-1){
                    if(p >= maxEnergy){
                        maxEnergy = p;
                        UpdatePath();
                    }
                    map[i][j] = 1;
                    isEscape = true;
                    result.remove();
                    return ;
                }

                Helper(i-1,j,p-3);
                Helper(i+1,j,p);
                Helper(i,j+1,p-1);
                Helper(i,j-1,p-1);
                map[i][j] = 1;
                result.remove();
        }

    }

    private static void UpdatePath() {
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s);
        }
        path = null;
        String[] tmp = sb.toString().split("-");
        sb.delete(0,sb.length());
        for (int i=tmp.length-1; i>=0; i--){
            if(i == 0){
                sb.append(tmp[i]);
                break;
            }
            sb.append(tmp[i]+",");
        }
        path = sb.toString();
    }
}
