import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       String S = sc.next();
      
       // 알파벳 갯수만큼 배열 생성 (a는 0, z는 25)
       int arr[] = new int[26];
       for (int i=0; i<26; i++) {
            arr[i] = -1;
       }

       for(int i=0; i<S.length(); i++) {
        
            // charAt(i) 함수
            // String 변수에서 사용할 수 있으며, i 자리에는 int형 변수를 넣어서 원하는 위치의 문자를 가져올 수 있음
            char ch = S.charAt(i);

            // arr[ch - 'a']가 -1이면 처음 등장한 알파벳이므로 해당 위치값 저장
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
       }
       for(int var : arr) {
            System.out.print(var + " ");
       }
   }
}