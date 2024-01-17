// 입력값: 테스트 케이스가 주어짐
//       각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어짐 
// 출력값: 각각의 테스트 케이스에 대해서 n보다 크거나 같은 소수 중 가장 작은 소수를 한 줄에 하나씩 출력
// 일단 사이트에서 돌려보고 안되면 다른 방법으로

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 테스트 케이스가 주어짐
        int t = Integer.parseInt(br.readLine());

        // 2. 각 테스트 케이스는 한 줄로 이루어져 있고 정수 n이 주어짐
        for(int i=0; i<t; i++) {
            long num = Long.parseLong(br.readLine());

            // 3. 소수 판별 후, 가장 작은 소수 출력
            if(isPrime(num)) {
                sb.append(num);
            } else {
                sb.append(getNextPrimeNum(num));
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
        br.close();
	}
	
    // 소수 판별 알고리즘
    // (2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나오면 소수로 정의)
    public static boolean isPrime(long num) {
        if(num == 0 || num == 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static long getNextPrimeNum(long num) {
        num++;
        while(!isPrime(num)) {
            num++;
        }
        return num;
    }
}