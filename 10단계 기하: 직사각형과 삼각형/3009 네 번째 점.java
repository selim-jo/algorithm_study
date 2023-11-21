// 입력값: x,y 3번
// 출력값: 직사각형의 네 번째 점의 좌표 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int[] rec_1 = { sc.nextInt(), sc.nextInt() }; // 첫번째 좌표
       int[] rec_2 = { sc.nextInt(), sc.nextInt() }; // 두번째 좌표
       int[] rec_3 = { sc.nextInt(), sc.nextInt() }; // 세번째 좌표

       sc.close();

       int x;
       int y;

       // x좌표 비교
       if(rec_1[0] == rec_2[0]) {
            x = rec_3[0];
       }
       else if(rec_1[0] == rec_3[0]) {
            x = rec_2[0];
       }
       else {
            x = rec_1[0];
       }

       // y좌표 비교
       if(rec_1[1] == rec_2[1]) {
            y = rec_3[1];
       }
       else if(rec_1[1] == rec_3[1]) {
            y = rec_2[1];
       } else {
            y = rec_1[1];
       }

       System.out.println(x + " " + y);
   }
}