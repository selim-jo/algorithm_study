// 입력값: 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어잠
// 출력값: 입력으로 주어진 글자의 아스키 코드 값을 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      // 문자에 대응하는 값 구하기
      int str = sc.next().charAt(0);

      System.out.print(str);
   }
}