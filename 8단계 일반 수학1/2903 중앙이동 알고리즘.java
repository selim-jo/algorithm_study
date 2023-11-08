import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값: 과정 갯수
        int N = sc.nextInt();

        // 출력값
        // N번 거친 후 점의 수 출력
        // 점의 수가 나오는 과정
        // 1. 정사각형의 각 변의 중앙에 점을 하나 추가함
        // 2. 정사각형의 중심에 점을 하나 추가함
        // ex) 1 -> 9, 2 -> 25, 5 -> 1089
        // 규칙이 있을거임 (n + (n-1))^2
        int result = 2;
        for(int i=0; i<N; i++) {
            result += (result-1);
        }
        System.out.println(result*result);
   }
}