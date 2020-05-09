package Day38;

public class LCA {
    public int getLCA(int a, int b) {
        // write code here

        while (a != b){
            if(a > b){
                a = a/2;
            }
            if(a < b){
                b = b/2;
            }
        }
        return a;
    }

//    public int getLCA(int a, int b) {
//        // write code here
//        if(a <= 0 || b <= 0){
//            return 0;
//        }
//
//    }
}
