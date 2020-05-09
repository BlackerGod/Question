package Day38;

public class Replacement {
    public static void main(String[] args) {
        System.out.println(replaceSpace("  ",2));
    }

    public static String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder sb = new StringBuilder(iniString);
        for (int i=0; i<length; i++){
            if(sb.charAt(i) == ' '){
                sb.replace(i,i+1,"%20");
                length = length+2;
            }
        }
        return sb.toString();
    }
}
