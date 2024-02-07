// 입력값: 첫째 줄에 자연수 m과 n이 빈칸을 두고 주어짐
// 출력값: 한 줄에 하나씩, 증가하는 순서대로 소수 출력

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 1. 입력값 주어짐
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        // 2. m과 n 사이를 for문 돌리면서 소수 확인
        for(int i=m; i<=n; i++) {
            // 값이 소수인지 확인
            if(isPrime(i)) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
   }

    // 소수 판별 알고리즘
    // (2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나오면 소수로 정의)
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<=Math.sqrt(num); i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }
}