// 입력값: 첫째 줄에 명령의 수 n이 주어짐
//       둘째 줄에 명령이 하나씩 주어짐
// cf) 출력을 요구하는 명령은 하나 이상 주어짐
// cf) 명령 8가지
// 1. 1 X : 정수 X를 덱의 앞에 넣음
// 2. 2 X : 정수 X를 덱의 뒤에 넣음 
// 3. 3   : 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력함. 없다면 -1을 대신 출력함.
// 4. 4   : 덱이 정수가 있다면 맨 뒤의 정수를 빼고 출력함. 없다면 -1을 대신 출력함.
// 5. 5   : 덱에 들어있는 정수의 개수를 출력함
// 6. 6   : 덱이 비어있으면 1, 아니면 0 출력
// 7. 7   : 덱에 정수가 있다면 맨 앞의 정수를 출력함. 없다면 -1을 대신 출력함.
// 8. 8   : 덱에 정수가 있다면 맨 뒤의 정수를 출력함. 없다면 -1을 대신 출력함.
// 출력값: 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력함

// 자바 덱(Deque) 클래스 기본
// 덱은 큐의 양쪽에 데이터를 넣고 뺄 수 있는 자료구조로, 큐 또는 스택으로도 사용할 수 있음
// 1. 덱 생성
// Deque<Integer> dq = new ArrayDeque<>();
// 2. 값 추가
// dq.offerFirst(값);
// dq.offerLast(값));
// 3. 값 제거
// dq.pollFirst();
// dq.pollLast();
// 4. 값 조회(제거안하고 리턴)
// dq.peekFirst();
// dq.peekLast();
// 5. 값 크기
// dq.size();
// 6. 값 비어있는지 확인
// dq.isEmpty();
// 7. 검색후 삭제 (First: 왼쪽에서 탐색, Last: 오른쪽에서 탐색)
// dq.removeFirstOccurrence(제거할 값);
// dq.removeLastOccurrence(제거할 값);
// dq.remove(제거할 값); //First와 동일
// 8. 값이 있는지 확인
// dq.contain(Object o);
// 9. 순회
// dq.iterator();
// dq.descendingIterator(); //역순변환

import java.util.*;

public class Main {
   public static void main(String args[]) {
        
        // 입력값
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();

        // 출력값
        for(int i=0; i<n; i++) {
            switch(sc.nextInt()) {
                case 1:
                    dq.offerFirst(sc.nextInt());
                    break;
                case 2:
                    dq.offerLast(sc.nextInt());
                    break;
                case 3:
                    if(dq.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(dq.pollFirst()).append("\n");
                    break;
                case 4:
                    if(dq.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(dq.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(dq.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case 7:
                    if(dq.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(dq.peekFirst()).append("\n");
                    break;
                case 8:
                    if(dq.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(dq.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
   }
}