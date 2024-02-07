// 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있음
// 입력값: 첫째 줄에 테스트 케이스의 개수 T가 주어짐
//       각 테스트 케이스는 한 줄로 이루어져 있고, 정수 N은 짝수임
// 출력값: 각각의 테스트 케이스마다 골드바흐 파티션의 수 출력
// 문제 풀이 방법 참고하여 품 (이해 더 필요함)

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {

        // 입력값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 소수 구하기 (에라토스테네스의 체 방식을 이용해 소수가 false인 배열을 만듦)
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for(int i = 2; i*i <= 1000000; i++) {
            if(!num[i]) {
                for(int j = i+i; j <= 1000000; j+= i) {
                    num[j] = true;
                }
            }
        }

        // 앞쪽에 있는 소수, 뒤쪽에 있는 소수를 탐색하여 둘 다 소수이면 ans++
        while(n -- > 0) {
            int temp = Integer.parseInt(br.readLine());
            int ans = 0;
            for(int j = 2; j <= temp / 2; j++) {
                if(!num[j] && !num[temp - j]) ans++;
            }
            System.out.println(ans);
        }

   }
}