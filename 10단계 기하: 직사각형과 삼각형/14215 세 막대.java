// 입력값: 길이 a, b, c인 세 막대
// 출력값: 만들 수 있는 가장 큰 삼각형의 둘레 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       // 입력값
       List<Integer> lists =  new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt()));
       lists.sort(Comparator.naturalOrder()); // 오름차순으로 정렬(작은 값에서 큰 값으로)

       // 출력값 (규칙 찾기)
       if(lists.get(0) + lists.get(1) > lists.get(2)) {
            System.out.println(lists.get(0) + lists.get(1) + lists.get(2));
       }
       else {
            System.out.println((lists.get(0) + lists.get(1))*2-1);
       }
   }
}