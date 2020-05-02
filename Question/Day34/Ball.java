package Day34;

import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double x0 = sc.nextDouble();
            double y0 = sc.nextDouble();
            double z0 = sc.nextDouble();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();
            ballSeq(x0,y0,z0,x1,y1,z1);
        }
    }

    private static void ballSeq(double x0, double y0, double z0, double x1, double y1, double z1) {
        double r = Math.sqrt(Math.pow(x0-x1,2)+Math.pow(y0-y1,2)+Math.pow(z0-z1,2));
        System.out.printf("%.3f ",r);
        System.out.printf("%.3f",(Math.pow(r,3)*Math.acos(-1))*4/3);
    }
}
