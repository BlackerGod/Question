package Day31;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String word = sc.nextLine();
            ReverseWord(word);
        }
    }

    private static void ReverseWord(String word) {
        if(word == null || word.length() == 0){
            return;
        }
        String reWord = Reverse(word);
        //System.out.println(reWord);
        int start = 0;
        int end = 0;
        StringBuilder result = new StringBuilder();
       while (start < word.length() && end < word.length()){
           if(reWord.charAt(start) == ' '){
               result.append(' ');
               start++;
           }else if(reWord.charAt(end) == ' ' || end == word.length()-1){
               if(end == word.length()-1){
                   result.append(Reverse(reWord.substring(start,end+1)));
                   break;
               }
               result.append(Reverse(reWord.substring(start,end)));
               start = end;
               end++;
           }else {
               end++;
           }
       }
        System.out.println(result.toString());
    }

    private static String Reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }
}
