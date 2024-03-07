import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       double subSum = 0; // 학점*과목평점
       double totSum = 0; // 총합

       for(int i=0; i<20; i++) {
            String subject = sc.next();
            double point = sc.nextDouble();
            String grade = sc.next();

            if(grade.equals("A+")) {
                subSum += point * 4.5;
                totSum += point;
            } else if(grade.equals("A0")) {
                subSum += point * 4.0;
                totSum += point;
            } else if(grade.equals("B+")) {
                subSum += point * 3.5;
                totSum += point;
            } else if(grade.equals("B0")) {
                subSum += point * 3.0;
                totSum += point;
            } else if(grade.equals("C+")) {
                subSum += point * 2.5;
                totSum += point;
            } else if(grade.equals("C0")) {
                subSum += point * 2.0;
                totSum += point;
            } else if(grade.equals("D+")) {
                subSum += point * 1.5;
                totSum += point;
            } else if(grade.equals("D0")) {
                subSum += point * 1.0;
                totSum += point;
            } else if(grade.equals("F")) {
                subSum += point * 0.0;
                totSum += point;
            }
       }
       System.out.printf("%.6f", subSum / totSum);
   }
}