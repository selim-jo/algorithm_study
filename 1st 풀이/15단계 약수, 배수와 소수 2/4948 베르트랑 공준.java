import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            
            // n이 0이면 종료
            if(n == 0) break;

            // 소수 개수를 세는 변수
            int count = 0;

            // n보다 크고 2n보다 작거나 같은 소수의 개수 구하기
            for(int i=n+1; i<=2*n; i++) {
                // 소수 이면, answer++
                if(isPrime(i)) count++;
            }
            // 소수의 개수 출력
            System.out.println(count);
        }
   }

    // 소수 판별 알고리즘
    // (2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나오면 소수로 정의)
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}