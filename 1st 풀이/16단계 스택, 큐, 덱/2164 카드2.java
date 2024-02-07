// 입력값: 첫째 줄에 정수 n이 주어짐
// 출력값: 첫째 줄에 남게되는 카드의 번호 출력
// 문제를 요약하자면 n장의 카드가 있고, 각각의 카드는 차례로 1부터 n까지의 번호가 붙어 있으며,
// 1번 카드가 제일 위에, n번 카드가 제일 아래인 상태로 순서대로 카드가 놓여 있음
// 다음과 같은 동작을 카드가 한 장 남을 때까지 반복하게 됨
// 우선, 제일 위에 있는 카드를 바닥에 버림 -> 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮김
// ex) n = 4 -> 4 (1234 -> 234 -> 342 -> 42 -> 24 -> 4)

// 자바 큐(queue) 클래스 기본
// 1. Queue 생성
// Queue<Integer> queue = new LinkedList<>();
// 2. 데이터 추가
// queue.add("값");
// queue.offer("값");
// 3. 데이터 삭제
// queue.poll(); <- queue에 첫번째 값을 반환하고 제거 비어있다면 null
// queue.remove(); <- queue에 첫번째 값 제거
// queue.clear(); <- queue 초기화
// 4. Queue에 가장 먼저 들어간 값 출력
// queue.peek();
// 5. Queue에 들어있는 개수
// queue.size();

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws Exception {
        
        // 입력값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        // 출력값
        for(int i=1; i<=n; i++) {
            // 카드 번호 큐에 담음            
            queue.offer(i);
        }

        while(queue.size() > 1) {
            // 맨 앞의 원소 버림
            queue.poll();
            // 맨 앞의 원소를 버림과 동시에 큐의 맨 뒤에 넣어줌
            queue.offer(queue.poll());
        }
        // 마지막 원소 출력
        System.out.println(queue.poll());
   }
}