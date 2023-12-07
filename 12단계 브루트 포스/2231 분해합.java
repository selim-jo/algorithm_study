// 입력값: 자연수 N
// 출력값: 생성자 출력(생성자가 없는 경우에는 0 출력)

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 기본적인 브루트포스 방식은 1부터 입력받은 N까지 한개씩 모두 대입해보는 것
       
       int n = sc.nextInt();
       int result = 0;

       for(int i=0; i<n; i++) {
            int num = i;
            int sum = 0; // 각 자릿수의 합을 sum으로

            // 이 부분 이해 필요함
            while(num != 0) {
                sum += num % 10; // 각 자릿수 더하기
                num /= 10;
            }

            // 생성자 찾았을 경우
            if(sum + i == n) {
                result = i;
                break;
            }
       }
       System.out.println(result);
   }
}