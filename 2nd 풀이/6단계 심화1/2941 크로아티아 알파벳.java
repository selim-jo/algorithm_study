// 1. 알파벳 소문자와 '-', '=' 조합한 단어가 입력됨
// 2. 입력으로 주어진 단어가 몇개의 크로아티아 알파벳으로 이루어져 있는지 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
       String str = sc.nextLine();

       for(int i=0; i<arr.length; i++) {
            // 문자가 arr 배열에 있는 값 포함하면
            if(str.contains(arr[i])) {
                // str 문자를 "@"로 대체"
                str = str.replace(arr[i], "@");
            }
       }
       // str 문자의 길이 출력
       System.out.println(str.length());
   }
}