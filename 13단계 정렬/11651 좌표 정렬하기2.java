// 입력값: 첫째줄에 점의 개수 N, 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어짐
//      cf) 좌표는 항상 정수이고, 위치가 같은 두 점은 없음
// 출력값: 첫째 줄부터 N개의 줄에 점을 정렬한 결과 출력
//       (좌표를 y가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순으로 정렬)

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       int n = sc.nextInt();
       // 2차원 배열 입력값
       int[][] arr = new int[n][2];

       for(int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
       }

       // 정렬 (람다식 사용)
       Arrays.sort(arr, (a1, a2) -> {
            // y좌표가 같을 경우
            if(a1[1] == a2[1]) {
                // x좌표가 증가하는 순으로 정렬
                return a1[0] - a2[0];
            // y좌표가 같지 않을 경우
            } else {
                // y좌표가 증가하는 순으로 정렬
                return a1[1] - a2[1];
            }
       });

      // 출력
      for(int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
      }
   }
}