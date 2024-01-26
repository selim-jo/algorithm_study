// 입력값: 첫쨰 줄에는 T개의 테스트 데이터로 주어짐
//       각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어짐
// 출력값: 입력 괄호 문자열이면 "YES", 아니면 "NO"를 한 줄에 하나씩 차례대로 출력함
// 원리 -> 여는 괄호가 있을 때는 스택에 쌓고, 닫는 괄호가 있으면 여는 괄호를 하나 지우면(pop) 됨

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
        int t = sc.nextInt();

        // 출력값
        for(int i=0; i<t; i++) {
            System.out.println(bracket(sc.next()));
        }
}

        public static String bracket(String s) {

            Stack<Character> stack = new Stack<>();

            for(int i=0; i<s.length(); i++) {

                char c = s.charAt(i);

                // 열린 괄호일 경우 스택에 넣음
                if(c == '(') {
                    stack.push(c);
                }
                
                // 닫힌 괄호일 경우
                // 스택이 비어있는 경우 -> "NO"
                else if(stack.empty()) {
                    return "NO";
                }
                // 그외의 경우 스택 원소 pop
                else {
                    stack.pop();
                }
            }
            // 검사 마친 후
            // 스택이 비어있으면 -> "YES"
            if(stack.empty()) {
                return "YES";
            }
            // 스택이 비어있지 않으면 -> "NO"
            else {
                return "NO";
            }
        }
   }