import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       int[][] arr = new int[9][9];
       int max = 0;
       int row = 0;
       int column = 0;
        
       // 1. 최댓값 출력
       // 2. 최댓값에 위치한 행 번호와 열 번호 출력
       for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
       }
       System.out.println(max);
       System.out.println((row+1) + " " + (column+1));
   }
}