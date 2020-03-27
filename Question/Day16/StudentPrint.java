package Day16;


import java.util.Scanner;


public class StudentPrint {
    public static void main(String[] args) {
        //int[] aimCount = new int[1000];
        //int index = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int peopleNum = sc.nextInt();
            if(peopleNum <= 0){
                break;
            }
            int[] tmp = new int[1000];
            for (int i = 0;i<peopleNum;i++){
                tmp[i] = sc.nextInt();
            }
            int aim = sc.nextInt();
            int count = 0;
            for (int i=0;i<peopleNum;i++){
             if(tmp[i] == aim){
                //aimCount[index]++;
                 count++;
            }
          }
            System.out.println(count);
            //index++;
        }

//        for (int i = 0;i<index;i++){
//            System.out.println(aimCount[i]);
//        }

        }

}
