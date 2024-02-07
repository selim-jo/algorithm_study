// 입력값: n개의 테스트 케이스 주어짐
// cf) 입력의 마지막엔 -1이 주어짐
// 출력값: 테스트 케이스마다 한줄에 하나씩 출력
// cf) 완전수냐 완전수가 아니냐에 따라 다르게 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       while(true) {
            int n = sc.nextInt();
            
            if(n == -1) break;
            
            int[] arr = new int[n]; // 약수 담을 배열
            int sum = 0; // 약수들 합
            int index = 0; // 약수 배열 인덱스

            // 배열 담기
            for(int i=1; i<=n; i++) {
                if(n%i == 0 && n != i) {
                    arr[index] = i;
                    index++;
                    sum += i;
                }
            }

            // 완전수 일 때
            if(n == sum) {
                    System.out.print(n + " = ");
                    
                    for(int i=0; i<n; i++) {
                        if(n/2 == arr[i]) {
                            System.out.println(arr[i]);
                        } else if(arr[i] != 0) {
                            System.out.print(arr[i] + " + ");
                        }
                    }
            // 완전수 아닐 때
            } else if(n != sum) {
                    System.out.println(n + " is NOT perfect.");
            }
       }
   }
}