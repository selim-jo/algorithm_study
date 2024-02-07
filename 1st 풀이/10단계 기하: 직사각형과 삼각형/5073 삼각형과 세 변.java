// 입력값: 각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력되며 마지막 줄은 0 0 0이며 이 줄은 계산하지 않음
// 출력값: 세 변의 길이가 모두 같은 경우 -> Equilateral
//       두 변의 길이만 같은 경우 -> Isosceles
//       세 변의 길이가 모두 다른 경우 -> Scalene
//       세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우 -> Invalid

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       while(true) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==0 && b==0 && c==0) {
                break;
            }

            if(a >= b+c || b >= a+c || c >= a+b) {
                System.out.println("Invalid");
            }

            else if(a==b && b==c && c==a) {
                System.out.println("Equilateral");
            }
            
            else if(a==b || b==c || c==a) {
                System.out.println("Isosceles");
            }

            else if(a!=b && b!=c && c!=a){
                System.out.println("Scalene");
            }
       }
       
   }
}