// 입력값: 문자열 s가 주어짐
// 출력값: s의 서로 다른 부분 문자열의 개수 구하기
// cf) 부분 문자열은 s에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 함


import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        String s = sc.nextLine();
        // 부분 문자열 저장할 곳 (동일한 값은 안되므로 hashSet 사용)
        HashSet<String> hashSet = new HashSet<>();

        // 출력값 
        // (이중 for문 사용하여 문자열 자르는 substring 사용해 add 함수 이용해 hashSet에 넣고)
        // (size() 함수 이용해 크기 구함)
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                hashSet.add(s.substring(i, j));
            }
        }
        System.out.println(hashSet.size());
   }
} 