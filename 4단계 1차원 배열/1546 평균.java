import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       float[] math = new float[N];
       float max = 0;
       float avg = 0;

       for(int i=0; i<math.length; i++) {
            math[i] = sc.nextInt();
            if(math[i] > max) {
                max = math[i];
            }
       }

       for(int j=0; j<math.length; j++) {
            avg += (math[j]/max*100)/N; // 이 부분 다시보기
       }
       System.out.println(avg);
   }
}