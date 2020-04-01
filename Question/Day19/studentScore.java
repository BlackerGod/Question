package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class studentScore {
    static class Student implements Comparable{
        private String name;
        private int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        @Override
        public int compareTo(Object o) {
          return this.score - ((Student) o).score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            List<Student> students = new ArrayList<>();
          int num = sc.nextInt();
          int sort = sc.nextInt();
            for (int i=0;i<num;i++) {
                String name = sc.next();
                int score = sc.nextInt();
                Student newstudent = new Student(name, score);
                students.add(newstudent);
            }
            PrintStudent(students,num,sort);
        }

    }

    private static void PrintStudent(List<Student> students, int num, int sort) {

        if(sort == 1){
            Collections.sort(students);
            for (int i = 0;i<num;i++){
                System.out.println(students.get(i).name+" "+students.get(i).score);
            }
            return;
        }
        if(sort == 0){
            SortHtoL(students);
            for (int i = 0;i<num;i++){
                System.out.println(students.get(i).name+" "+students.get(i).score);
            }
        }
    }

    private static void SortHtoL(List<Student> students){
        for (int i = 0;i<students.size()-1;i++){
            for (int j = i+1;j>0;j--){
                if(students.get(j).score > students.get(j-1).score){
                    Student tmp = students.get(j);
                    students.set(j,students.get(j-1));
                    students.set(j-1,tmp);
                }
            }
        }
    }
    private static void SortHtoL2(List<Student> students){
        for (int i = 0;i<students.size()-1;i++){
            for (int j = i+1;j>0;j--){
                if(students.get(j).score < students.get(j-1).score){
                    Student tmp = students.get(j);
                    students.set(j,students.get(j-1));
                    students.set(j-1,tmp);
                }
            }
        }
    }
}
