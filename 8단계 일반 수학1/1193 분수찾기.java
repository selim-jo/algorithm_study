import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int X = sc.nextInt();  // 입력받을 변수
        int crossCount = 1;    // 
        int prevCountSum = 0;

        // 출력값
        // 어떤 규칙이 있는지 찾아야 함
        // 대각선의 칸의 갯수는 T-1, 대각선의 갯수가 홀수인지, 짝수인지 판별
        while (true) {

            if (X <= prevCountSum + crossCount) {

                if (crossCount % 2 == 1) { // 대각선의 갯수가 홀수라면
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