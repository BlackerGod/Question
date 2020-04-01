package Day19;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[]  result = new boolean[n];
        for (int i = 0;i<n;i++){
            result[i] = s.contains(p[i]);
        }
        return result;
    }
}
