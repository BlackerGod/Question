package Day25;

import java.util.Scanner;

public class BeiDa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int[] course = new int[n];
            int[] score = new int[n];
            for (int i =0;i<n;i++){
                course[i] = sc.nextInt();
            }
            for (int i =0;i<n;i++){
                score[i] = sc.nextInt();
            }
            PrintGPA(course,score,n);
        }
    }

    private static void PrintGPA(int[] course, int[] score, int n) {
        double GPA = 0.0;
        int sum = 0;
        for (int i = 0; i < n;i++){
            if(score[i] <= 100 && score[i] >= 90){
                GPA += course[i] * 4.0;
            } else if(score[i] <= 89 && score[i] >= 85){
                GPA += course[i] * 3.7;
            } else if(score[i] <= 84 && score[i] >= 82){
                GPA += course[i] * 3.3;
            } else if(score[i] <= 78 && score[i] >= 81){
                GPA += course[i] * 3.0;
            } else if(score[i] <= 77 && score[i] >= 75){
                GPA += course[i] * 2.7;
            } else if(score[i] <= 74 && score[i] >= 72){
                GPA += course[i] * 2.3;
            } else if(score[i] <= 71 && score[i] >= 68){
                GPA += course[i] * 2.0;
            } else if(score[i] <= 67 && score[i] >= 64){
                GPA += course[i] * 1.5;
            }else if(score[i] <= 63 && score[i] >= 60){
                GPA += course[i] * 1.0;
            }
        }
        for (int i = 0; i < n;i++){
            sum  += course[i];
        }
        System.out.printf("%.2f",GPA/sum);
    }
}
