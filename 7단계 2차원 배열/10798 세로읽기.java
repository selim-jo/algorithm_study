import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 배열 선언 (글자 하나하나씩 배열에 담기는 것)
       char[][] arr = new char[5][15];

       // 입력 받은 문자 그대로 출력
       String str = "";
       for(int i=0; i<arr.length; i++) {
            str = sc.next();
            // 15개 문자 삽입
            for(int j=0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
       }

       // 세로로 출력
       for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
       }


   }
}