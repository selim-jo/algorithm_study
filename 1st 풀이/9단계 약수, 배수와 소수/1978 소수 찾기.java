// 입력값: N (테스트 케이스 N개)
// 출력값: 소수의 개수

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int count = 0;

       for(int i=0; i<N; i++) {

            boolean isPrime = true; // 소수인 경우 true
            int num = sc.nextInt();

            if(num == 1) {
                continue;
            }
            
            for(int j=2; j<=Math.sqrt(num); j++) {
                if(num%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
       }
        System.out.println(count);
   }
}