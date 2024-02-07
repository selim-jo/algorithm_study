// 입력값: N
// 출력값: 자리수를 내림차순으로 정렬한 수 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

      // 입력값을 문자로 받음
       String str = sc.next();
       String[] arr = str.split("");
       
       // 문자 -> 숫자 변환값 담을 곳
       int[] intArr = new int[arr.length];
       
       // 문자 -> 숫자 변환
       for(int i=0; i<arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
       }

       // 배열 내림차순으로 정렬
       Arrays.sort(intArr);
       
       // 배열 값 차례대로 출력
       for(int i=intArr.length-1; i>=0; i--) {
            System.out.print(intArr[i]);
       }
   }
}