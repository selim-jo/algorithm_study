import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값: A(올라가고), B(미끄러짐), V(높이)
       int A = sc.nextInt();
       int B = sc.nextInt();
       int V = sc.nextInt();

       // 출력값: 달팽이가 나무 막대를 올라가는데 며칠 걸리는지 (주의! 정상에 올라간 후에는 미끄러지지 않음)
       int day = (V - B) / (A - B);

       // 잔여r가 있을 경우
       if((V - B) % (A - B) != 0) {
            day++;
       }
       System.out.println(day);
   }
}