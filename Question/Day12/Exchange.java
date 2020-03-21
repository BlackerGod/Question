package Day12;

public class Exchange {
    public static void main(String[] args) {
        exchangeAB(new int[]{1,2});
    }
    public static int[] exchangeAB(int[] AB) {
       if(AB.length != 2){
           return AB;
       }
       AB[0] = AB[0] ^ AB[1];
       AB[1] = AB[0] ^ AB[1];
       AB[0] = AB[0] ^ AB[1];
       return AB;
    }
}
