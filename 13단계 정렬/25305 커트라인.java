// 입력값: 첫째줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어짐
//       둘쨰줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어짐
// 출력값: 상을 받는 커트라인 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       int n = sc.nextInt();
       int k = sc.nextInt();
       Integer[] arr = new Integer[n];
       
       for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
       }

       // 배열 내림차순으로 정렬
       Arrays.sort(arr, Collections.reverseOrder());
       
       // 출력값
       System.out.println(arr[k-1]);

   }
} 