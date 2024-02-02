// 입력값: 첫째 줄에 N과 K가 빈 칸을 사이에 순서대로 주어짐
// 출력값: 요세푸스 순열 출력

// 자바 큐(queue) 클래스 기본
// 1. Queue 생성
// Queue<Integer> queue = new LinkedList<>();
// 2. 데이터 추가
// queue.add("값");
// queue.offer("값");
// 3. 데이터 삭제
// queue.poll(); <- queue에 첫번째 값을 반환하고 제거 비어있다면 null
// queue.remove(); <- queue에 첫번째 값 제거
// queue.clear(); <- queue 모든 요소 삭제
// 4. Queue에 가장 먼저 들어간 값 출력
// queue.peek();
// 5. Queue에 들어있는 개수
// queue.size();

// 요세푸스 순열 개념 이해 안가 풀이 내용 참고

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // 입력값
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++) {
            queue.add(i);
        }

        // 출력값
        StringBuilder sb = new StringBuilder();
        // 첫번째 들어가야 할 값
        sb.append('<');

        // 마지막 원소 전까지 반복하며 출력
        while(queue.size() > 1) {
            
            for(int i=0; i<k-1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }
            sb.append(queue.poll()).append(", ");
        }

        // 마지막 원소 출력뒤 ">" 붙임
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
   }
}