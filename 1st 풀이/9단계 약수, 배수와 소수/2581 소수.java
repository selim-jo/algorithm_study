// 주말에 에리토스테네스 체 알고리즘에 대해 공부하기

// 입력값: M, N
// 출력값: M이상 N 이하의 자연수 중 소수인 것 모두 찾아 첫째줄에 합, 둘째줄에 최솟값
// cf) 단, 소수가 없을 경우 첫째줄에 -1 출력

import java.util.*;

public class Main {

   public static boolean prime[];

   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        prime = new boolean[N+1]; // 배열 생성
        get_prime();

        // 소수 합 및 최소값 구하기
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=M; i<=N; i++) {
            if(prime[i] == false) { // prime[i]가 소수라면
                sum += i;
                // 첫 소수가 최솟값임
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if(sum == 0) { // 소수가 없다면
                    System.out.println(-1);      
        } else {
                    System.out.println(sum);
                    System.out.println(min);
        }
   }
    // 에라토스테네스 체 알고리즘
    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;

        for(int i=2; i<=Math.sqrt(prime.length); i++) {
            for(int j=i*i; j<prime.length; j+=i) {
                prime[j] = true; // 소수가 아님
            }
        }
    }
}
