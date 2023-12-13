// 그리디 알고리즘 문제
// 입력값: 자연수 N
// 출력값: 상근이가 배달하는 봉지의 최소 개수
// 만약, 정확하게 N킬로그램읆 만들 수 없다면 -1 출력
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있음

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값 
       int n = sc.nextInt();
       int cnt = 0;
      
       // 출력값
       while(true) {
            // 5로 나눠서 나머지가 0이면 그대로 출력
            if(n % 5 == 0) {
                cnt += n/5;
                System.out.println(cnt);
                break;
            // 5로 나눠서 나머지가 0이 아닐 경우 3 빼주고 봉지 갯수 더해줌
            } else {
                n -= 3;
                cnt++;
            }

            // n이 0이 나올 경우 -1 출력
            if(n < 0) {
                System.out.println("-1");
                break;
            }
       }
     

   }
}