// 입력값: 첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어짐
// 출력값: 첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력함

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int[] arr = new int[5];
       int sum = 0;
       int avg = 0;
       int mid = 0;

       // 입력값
       for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
       }
       
       // 배열 오름차순으로 정렬
       Arrays.sort(arr);

       // 출력값
       avg = sum / 5;
       mid = arr[2];
       System.out.println(avg);
       System.out.println(mid);

   }
} 