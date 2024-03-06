// 1. 단어 입력받고
// 2. for문 돌려 단어의 알파벳 개수 세기
// 3. 가장 많이 사용된 알파벳 여러개면 -> '?' 출력
//    가장 많이 사용된 알파벳 1개이면 -> 그 알파벳의 대문자 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {
 
       Scanner sc = new Scanner(System.in);

       String str = sc.next().toUpperCase(); // 입력값 모두 대문자로
       int[] arr = new int[26]; // 알파벳 개수 26개

       for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - 'A'; // A = 65
            arr[num]++;
       }

       int max = 0;
       char result = '?';
       for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                result = (char)(i + 'A');
            } else if(max == arr[i]) {
                result = '?';
            }
       }
       System.out.println(result);
   }
}