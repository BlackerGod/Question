package Day24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrintStudent {
    static class Student{
        public int ID;
        public int socre;

        public Student(int ID, int socre) {
            this.ID = ID;
            this.socre = socre;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            List<Student> students = new ArrayList<>();
            for (int i =0;i<num1;i++){
                int score = sc.nextInt();
                Student newStudent = new Student(i+1,score);
                students.add(newStudent);
            }
            for (int j = 0;j< num2;j++){
                char c = sc.next().charAt(0);
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(c == 'Q'){
                    PrintSt(students,a,b);
                }else if(c == 'U'){
                    Update(students,a,b);
                }else {
                    break;
                }
            }

        }
    }

    private static void Update(List<Student> students, int a, int b) {
        students.get(a-1).socre = b;

    }

    private static void PrintSt(List<Student> students, int a, int b) {
        if(a == b){
            System.out.println(students.get(a-1).socre);
            return;
        }
        int max = 0;
        int start = 0;
        int end = 0;

        if(a < b){
            start = a-1;
            end = b-1;
        }else {
            start = b-1;
            end = a-1;
        }
        for (;start<=end;start++){
            if (students.get(start).socre > max){
                max = students.get(start).socre;
            }
        }
        System.out.println(max);
    }
}
