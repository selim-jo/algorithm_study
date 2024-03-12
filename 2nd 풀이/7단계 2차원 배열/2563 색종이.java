import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int num = sc.nextInt(); // 색종이 수

       int[][] arr = new int[100][100]; // 가로, 세로 100인 정사각형 모양의 흰색 도화지

       // num 수 만큼 입력
       for(int i=0; i<num; i++) {
            int row = sc.nextInt(); // 가로
            int column = sc.nextInt(); // 세로
            for(int j=row; j<row+10; j++) {
                // 사각형 부분에 1 넣기
                for(int k=column; k<column+10; k++) {
                    arr[k][j] = 1;
                }
            }
       }

       // 사각형 부분이 1인 숫자만 더하기
       int result = 0;
       for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(arr[i][j] == 1) {
                    result += arr[i][j];
                }
            }
       }
       System.out.println(result); // 결과값 출력
   }
}