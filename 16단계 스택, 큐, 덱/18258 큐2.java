// 입력값: 첫째 줄에 명령의 수 n이 주어짐
//       둘째 줄에 명령이 하나씩 주어짐
// cf) 명령 6가지
// 1. push X : 정수 X를 큐에 넣는 연산
// 2. pop    : 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력함
//             만약 큐에 들어있는 정수가 없는 경우에는 -1 출력함
// 3. size   : 큐에 들어있는 정수의 개수를 출력함
// 4. empty  : 큐가 비어있으면 1, 아니면 0을 출력함
// 5. front  : 큐의 가장 앞에 있는 정수 출력함
//             만약 큐에 들어있는 정수가 없는 경우에는 -1 출력함
// 6. back   : 큐의 가장 뒤에 있는 정수를 출력함
//             만약 큐에 들어있는 정수가 없는 경우에는 -1 출력함
// 출력값: 출력해야하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력함

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

// LinkedList 이용
// LinkedList<Integer> q = new LinkedList<>();
// q.offer();	// push
// q.pop();	// pop
// q.size();	// size
// q.isEmpty();	// empty
// q.peek();	// front
// q.peekLast();	// back

// 시간 초과 나옴

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws Exception {
        
        // 입력값
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        LinkedList<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();

        // 출력값
        for(int i=0; i<n; i++) {
            switch(sc.next()) {
                case "push":
                    queue.add(sc.nextInt());
                    break;
                case "pop":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(queue.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
   }
}