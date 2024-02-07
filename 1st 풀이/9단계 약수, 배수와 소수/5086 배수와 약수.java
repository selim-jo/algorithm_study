// 입력값: 여러개, 마지막줄에는 0 2개
// 출력값: 1) 첫번째 숫자가 두번째 숫자의 약수 -> factor
//       2) 첫번째 숫자가 두번째 숫자의 배수 -> multiple
//       3) 첫번째 숫자가 두번째 숫자의 약수와 배수 모두 x -> neither

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       while(true) {
            int first = sc.nextInt();
            int second = sc.nextInt();

            if(first == 0 && second == 0) break;

            if(second % first == 0) {
                System.out.println("factor");
            }
            else if(first % second == 0) {
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }
       }
   }
}