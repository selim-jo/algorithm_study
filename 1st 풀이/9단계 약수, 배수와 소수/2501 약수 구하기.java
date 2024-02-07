// 입력값: N, K
// 출력값: N의 약수들 중 K번째로 작은 수 출력
// cf) N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우 0 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int K = sc.nextInt();
       int count = 0;

       // N을 1~N까지 나눠 나머지가 0이 되는 것 추출
       for(int i=1; i<=N; i++) {
            if(N % i == 0) {
                count++;
            }
            
            if(count == K) {
                System.out.println(i);
                break;
            }
       }
       if(count < K) {
            System.out.println(0);
        }
   }
}