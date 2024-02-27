import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int T = sc.nextInt();

       for(int i=0; i<T; i++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열

            //charAt()을 사용해서 추출한 문자를 R만큼 반복
            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    // S.charAt(j): j번째 문자값 가져오기
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
       }
   }
}