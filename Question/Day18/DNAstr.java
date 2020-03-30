package Day18;



import java.util.Scanner;

public class DNAstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()){
            String DNA = sc.nextLine();
            int GCB = sc.nextInt();
            FindLengthDNA(DNA, GCB);
      //  }
    }

    private static void FindLengthDNA(String dna, int gcb) {
        if(gcb == dna.length()){
            System.out.println(dna);
          }
        int max = 0;
        String result = "";

        for (int i = 0;i<dna.length()-gcb;i++){
            int tmp=0;
            StringBuilder sb = new StringBuilder();
            for (int j = i ;j<i+gcb;j++){
                if(dna.charAt(j) == 'G' || dna.charAt(j) == 'C'){
                    tmp++;
                }
                sb.append(dna.charAt(j));
            }
            if(tmp > max){
                result = sb.toString();
                max = tmp;
            }
        }

        System.out.println(result);
    }
}
