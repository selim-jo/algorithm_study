// 입력값: 3개의 줄에 걸쳐 삼각형의 각의 크기 주어짐
// 출력값: 세 각의 크기 모두 60 -> Equilateral
//     : 세 각의 합이 180이고, 두 각이 같은 경우 -> Isoceles
//     : 세 각의 합이 180이고, 같은 각이 없는 경우 -> Scalence
//     : 세 각의 합이 180이 아닌 경우 -> Error

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();

       // 출력값
       if(A==60 && B==60 && C==60) {
            System.out.println("Equilateral");
       }
       else if(A+B+C==180 && (A==B || A==C || B==C)) {
            System.out.println("Isosceles");
       }
       else if(A+B+C==180 && (A!=B && A!=C && B!=C)) {
            System.out.println("Scalene");
       }
       else if(A+B+C != 180) {
            System.out.println("Error");
       }
   }
}