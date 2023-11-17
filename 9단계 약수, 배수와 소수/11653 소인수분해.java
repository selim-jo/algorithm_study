// 소인수분해 개념: 어떤 수를 소수인 인수로 분해하는 것 의미
// 입력값: N (테스트 케이스 N개)
// 출력값: N의 소인수분해 결과를 한줄에 하나씩 오름차순으로 출력
// (단, N의 1인 경우 아무것도 출력x)

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int count = 0;

       if(N == 1) {
            System.out.println(" ");
       }
       else {
            // Math.sqrt() 사용 이유: 소수를 찾을 때 반복을 줄여 리소스를 줄일 수 있음
            for(int i=2; i<=Math.sqrt(N); i++) {
                while(N % i == 0) {
                    System.out.println(i);
                    N /= i;
                }
            }
            if(N != 1) {
                System.out.println(N);
            }
       }
   }
}