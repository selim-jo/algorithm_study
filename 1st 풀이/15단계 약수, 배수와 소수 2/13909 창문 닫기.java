// 입력값: 첫 번째 줄에는 창문의 개수와 사람의 수 n이 주어짐
// 출력값: 마지막에 열려있는 창문의 개수 출력
// ex) 1번째 사람은 1의 배수 번째 창문이 열려 있으면 닫고 닫혀 있으면 연다.
//     2번째 사람은 2의 배수 번째 창문이 열려 있으면 닫고 닫혀 있으면 연다.

// 마지막에 열려있는 창문의 개수 -> 소인수분해했을 때 소인수의 갯수가 홀수가 되는 수
// ex) 1, 4, 9, 16, 25 (n^2의 값)
// So, Math.sqrt(n)해서 내림해준 값 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int n = sc.nextInt();

        // 출력값
        int result = (int)Math.floor(Math.sqrt(n));

        System.out.println(result);
   }
}