import java.util.Scanner;
import java.util.HashSet;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       // HashSet 이용
       // 1. 중복원소 허용x
       // 2. 순서 개념x (so, Collections.sort() 사용 불가)
       HashSet<Integer> h = new HashSet<Integer>();

       for(int i=0; i<10; i++) {
            h.add(sc.nextInt() % 42); // add 메소드 사용해 hashset에 저장
       }
       
       sc.close();
       System.out.print(h.size());
   }
}