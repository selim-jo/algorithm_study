import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int X = sc.nextInt();

        // 출력값: 규칙
        // 1 -> 1/1, 2 -> 1/2, 3 -> 2/1, 4 -> 3/1, 5 -> 2/2, 6 -> 1/3
        // 7 -> 1/4, 8 -> 2/3, 9, -> 3/2, ...
        int crossCount = 1; // 해당 범위 대각선의 갯수 (T-1)
        int prevCountSum = 0; // 해당 대각선 직전 대각선까지의 칸의 누적 합 (1~T-1)
        
        while (true) {

            if (X <= prevCountSum + crossCount) {
                
                // 대각선의 갯수가 홀수라면
                if (crossCount % 2 == 1) {
                    // 분자가 큰 수부터 시작
                    System.out.print((crossCount - (X - prevCountSum - 1)) + "/" + (X - prevCountSum));
                    break;
                } else {
                    System.out.print((X - prevCountSum) + "/" + (crossCount - (X - prevCountSum - 1)));
                    break;
                }
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
         }

   }
}