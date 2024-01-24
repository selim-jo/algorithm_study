// 입력값: 첫째 줄에 명령의 수 n이 주어짐
//       둘째 줄에 명령이 하나씩 주어짐
// cf) 출력을 요구하는 명령은 하나 이상 주어짐
// cf) 명령 5가지
// 1. 1 X : 정수 X를 스택에 넣음
// 2. 2   : 스택에 정수가 있다면 맨 위의 정수를 빼고 출력함. 없다면 -1을 대신 출력함
// 3. 3   : 스택에 들어있는 정수의 개수 출력함
// 4. 4   : 스택이 비어있으면 1, 아니면 0 출력함
// 5. 5   : 스택에 정수가 있다면 맨 위의 정수를 출력함. 없다면 -1을 대신 출력함.
// 출력값: 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력함

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

import java.util.*;

public class Main {
   public static void main(String args[]) {
        
        // 입력값
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();

        // 출력값
        for(int i=0; i<n; i++) {
            switch(sc.nextInt()) {
                case 1:
                    st.push(sc.nextInt());
                    break;
                case 2:
                    if(st.empty()) sb.append("-1").append("\n");
                    else sb.append(st.pop()).append("\n");
                    break;
                case 3:
                    sb.append(st.size()).append("\n");
                    break;
                case 4:
                    if(st.empty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case 5:
                    if(st.empty()) sb.append("-1").append("\n");
                    else sb.append(st.peek()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
   }
}