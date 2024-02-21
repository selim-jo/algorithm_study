import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt(); // 시험 본 과목의 개수 N
       float[] math = new float[N];
       float max = 0;
       float avg = 0;

       // 최고점수 찾기
       for(int i=0; i<math.length; i++) {
            math[i] = sc.nextInt();
            if(math[i] > max) {
                max = math[i];
            }
       }
    
       // 새로운 평균값 출력
       for(int j=0; j<math.length; j++) {
            avg += (math[j]/max*100)/N;
       }
       System.out.println(avg);
   }
}