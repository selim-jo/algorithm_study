import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> h = new HashSet<Integer>(); // HashSet: 중복원소 허용x

        for(int i=0; i<10; i++) {
            h.add(sc.nextInt() % 42);
        }

        sc.close();
        // hashSet은 중복값을 허용하지 않으므로, size를 출력하면 중복 제외하여 값 출력
        System.out.println(h.size());
   }
}