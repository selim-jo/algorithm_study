// 입력값: N (점의 개수), N줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어짐
// 출력값: N개의 점을 둘러싸는 최소 크기의 직사각형의 넓이

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int[] arrX = new int[N];
       int[] arrY = new int[N];
       int maxX = -10000;
       int minX = 10000;
       int maxY = -10000;
       int minY = 10000;

       for(int i=0; i<N; i++) {

            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();

            if(arrX[i] > maxX) {
                maxX = arrX[i];
            }
            
            if(arrX[i] < minX) {
                minX = arrX[i];
            }

            if(arrY[i] > maxY) {
                maxY = arrY[i];
            }

            if(arrY[i] < minY) {
                minY = arrY[i];
            }
       }

       System.out.println((maxX-minX) * (maxY-minY));
   }
}