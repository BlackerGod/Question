package Day37;



import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class wallIsSq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N = Integer.parseInt(scanner.nextLine());
            List<Integer> wood = new LinkedList<>();
            int choose = 0;
            int length = 0;
            for (int i=0; i<N; i++){
                choose = scanner.nextInt();
                length = scanner.nextInt();
                if(choose == 1){
                    wood.add(length);
                }else if(choose == 2){
                    wood.remove(wood.lastIndexOf(length));
                }

                int sum = 0;
                Collections.sort(wood);
                for (int j=0; j<wood.size()-1;j++){
                    sum += wood.get(j);
                }
                if(wood.size() < 3 || sum <= wood.get(wood.size()-1)){
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }

            }
        }
    }
}
