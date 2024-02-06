// 입력값: 첫째 줄에 자연수 n이 주어짐
//       다음 줄에는 차례로 각 풍선 안의 종이에 적혀 있는 수가 주어짐
// cf) 종이에 0은 적혀있지 않음
// 출력값: 첫째 줄에 터진 풍선의 번호를 차례로 나열함

import java.util.*;

class Ballon {
    int index; // 풍선 번호
    int value; // 적혀있는 값

    public Ballon(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {
   public static void main(String args[]) {
        
        // 입력값
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Deque<Ballon> dq = new ArrayDeque<>();
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int value = sc.nextInt();
            dq.add(new Ballon(i, value));
        }

        // 출력값
        while(!dq.isEmpty()) {
            // 맨 앞에 있는 풍선의 번호 sb에 저장
            sb.append(dq.getFirst().index + " ");

            // 맨 앞에 있는 풍선 꺼낸 후, 적혀있는 값 저장
            int next = dq.poll().value;

            // 남아있는 풍선 없으면 종료
            if(dq.isEmpty()) {
                break;
            }

            // 적혀있는 값이 양수인 경우
            if(next > 0) {
                for(int i=0; i<next-1; i++) {
                    dq.addLast(dq.pollFirst());
                }
            }

            // 적혀있는 값이 음수인 경우
            else {
                for(int i=0; i<Math.abs(next); i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        System.out.println(sb);
    }
}