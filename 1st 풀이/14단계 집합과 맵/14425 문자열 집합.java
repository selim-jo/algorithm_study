// 입력값: 첫째줄에는 문자열 개수 n과 m 주어짐
//       다음 n개의 줄에는 집합 S에 포함되어 있는 문자열이 주어짐
//       다음 m개의 줄에는 검사해야 하는 문자열들이 주어짐
// cf) 입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않음
//     집합 S에 같은 문자열이 여러 번 주어지는 경우는 없음
// 출력값: 첫째 줄에 m개의 문자열 중에 총 몇 개가 집합 s에 포함되어 있는지 출력함

import java.util.*;
import java.io.*;

public class Main {
    // 입력값
   static int n;
   static int m; 
   static HashSet<String> hashSet;
   static int count;
   public static void main(String args[]) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());


       // 입력값
       n = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(st.nextToken());
       hashSet = new HashSet<>();

       for(int i=0; i<n; i++) {
            // hashSet add 메소드 이용해 값 넣어주기
            hashSet.add(br.readLine());
       }

       for(int i=0; i<m; i++) {
            String str = br.readLine();
            // hashSet contains 메소드 이용해 값 비교하기
            if(hashSet.contains(str)) {
                // 값이 있으면 count + 해줌
                count++;
            }
       }
       System.out.println(count);
       br.close();
   }
}