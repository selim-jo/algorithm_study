import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값: 과정 갯수
        int N = sc.nextInt();

        // 출력값
        // ex) 1 -> 9, 2 -> 25, 5 -> 1089
        // 규칙 (n + (n-1))^2
        int result = 2;
        for(int i=0; i<N; i++) {
            result += (result-1);
        }
        System.out.println(result*result);
   }
}