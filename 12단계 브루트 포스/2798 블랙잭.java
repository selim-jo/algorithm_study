// 입력값: 첫째 줄에 카드의 개수 N, M
//       둘째 줄에 카드에 쓰여있는 수가 주어짐
// 출력값: M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt(); // 카드 개수
       int m = sc.nextInt(); // 넘지않고 가까워야하는 수
       int sum = 0; // 세 수의 합
       int tmp = 0; // 근사치

       int[] arr = new int[n];

       for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt(); // 카드에 적힌 수
       }

       for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(tmp < sum && sum <= m) {
                        tmp = sum;
                    }
                }
            }
       }
       System.out.println(tmp);
   }
}