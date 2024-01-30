// 입력값: 입력의 첫째 줄에는 현재 승환의 앞에 서 있는 학생들의 수 N이 주어짐
//       다음 줄에는 승환이 앞에 서있는 모든 학생들의 번호표(1,2,...,N) 순서가 앞에서부터 뒤 순서로 주어짐
// 출력값: 승환이가 무사히 간식을 받을 수 있다면 "Nice", 그렇지 않다면 "Sad" 출력
// cf) 1,2,...,N -> 오름차순
// 스택과 큐 활용 (풀이 참고)

// 자바 스택(stack) 클래스 기본
// 1. Stack 생성
// Stack<Element> stack = new Stack<>();
// 2. 데이터 추가
// public Element push(Element item);
// 3. 최근에 추가된(Top) 데이터 삭제
// public Element pop();
// 4. 최근에 추가된(Top) 데이터 조회
// public Element peek();
// 5. 스택 값이 비었는지 확인, 비었으면 true, 아니면 false
// public boolean empty();
// 6. 인자값으로 받은 데이터의 위치 반환
// public int search(Object o);

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

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws Exception {
        
        // 입력값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생 수
        int n = Integer.parseInt(br.readLine());
        // 대기열
        Queue<Integer> queue = new LinkedList<>();
        // 추가 대기열
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<n; i++) {
            // 큐에 값 추가
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        // 간식 먹는 순서
        int start = 1;

        // 대기열(queue)에 학생수가 없을 때까지 실행
        while(!queue.isEmpty()) {
            // 간식 먹는 순서가 맞다면 값 삭제
            if(queue.peek() == start) {
                queue.poll();
                start++;
            // 스택 검사 (스택도 큐와 동일하게 검사)
            } else if(!stack.isEmpty() && stack.peek() == start) {
                stack.pop();
                start++;
            // 큐 대기열에 있는 학생의 순서가 start와 동일하지 않다면 큐의 값을 스택에 넣음
            // 여기서 queue.poll()은 삭제된 value값 의미
            } else {
                stack.push(queue.poll());
            }
        }

        // 스택에 학생이 남아있을 경우 간식 순서대로 나오는지 확인
        while(!stack.isEmpty()) {
            // 간식 순서가 맞을 경우
            if(stack.peek() == start) {
                stack.pop();
                start++;
            // 간식 순서가 틀릴 경우
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
   }
}