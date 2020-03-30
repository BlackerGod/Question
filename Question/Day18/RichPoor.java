package Day18;

public class RichPoor {
    public static void main(String[] args) {
        richchangepoor(30);

    }

    private static void richchangepoor(int days){
        int rich = days*10;
        int poor = 0;
        for (int i = 0; i < days;i++){
            poor += pow(i);
        }
        System.out.println(rich+" "+poor);
    }
    private static int pow(int cifang){
        int reuslt = 1;
        for (int i=0;i<cifang;i++){
            reuslt *= 2;
        }
        return reuslt;
    }
}
