// 입력값: 자연수 N
// 출력값: N번째 영화의 제목에 들어간 수 출력
// 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수 뜻함

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       
       // 종말의 수
       int fin_num = 666;
       int count = 1;
       
       // count와 n 값이 다를 경우 (같아지면 종료)
       while(count != n) {
            fin_num++;

            // int형인 num을 String으로 변환한뒤 666 포함하고 있는지 확인
            if(String.valueOf(fin_num).contains("666")) {
                count++;
            }
       }
       // 종말의 수 출력
       System.out.println(fin_num);
   }
}