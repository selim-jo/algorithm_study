// 입력값: 가장 아랫부분의 정사각형 개수 n
// 출력값: 실선으로 이루어진 도형의 둘레의 길이 (cf) 한 변의 길이 1인 정사각형)\
// 1 -> 4, 2 -> 8(4-1+5), 3 -> 12(8-2+6), 4 -> 16(12-3+7), 5 -> 20(16-4+8)
// 단, 여기서 n의 범위가 int의 범위를 초과하므로 long형을 써서 n을 입력받아야함

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       long n = sc.nextLong();

       // 출력값 : 규칙 찾기
       System.out.println(4*n);

   }
}