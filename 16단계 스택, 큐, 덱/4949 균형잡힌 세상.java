// 입력값: 각 문자열은 마지막 글자를 제외하고 영문 알파벳, 공백, 
//        소괄호("()"), 대괄호("[]")로 이루어져 있으며 온점(".")으로 끝남
// 출력값: 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력
// cf) "."과 같이 괄호가 하나도 없는 경우도 균형잡힌 문자열로 간주할 수 있음
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
        String s;

        // 출력값
        while(true) {
            s = sc.nextLine();

            // 종료 조건문
            if(s.equals(".")) {
                break;
            }
            System.out.println(bracket(s));
        }
    }

        public static String bracket(String s) {

            Stack<Character> stack = new Stack<>();

            for(int i=0; i<s.length(); i++) {

                char c = s.charAt(i);

                // 열린 괄호일 경우 스택에 넣음
                if(c == '(' || c == '[') {
                    stack.push(c);
                }
                
                // 닫힌 괄호가 소괄호일 경우
                else if(c == ')') {
                    // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭 안되는 경우
                    if(stack.empty() || stack.peek() != '(') {
                        return "no";
                    } else {
                        stack.pop();
                    }
                }
                
                // 닫힌 괄호가 대괄호일 경우
                else if(c == ']') {
                    // 스택이 비어있거나 pop할 원소가 대괄호랑 매칭 안되는 경우
                    if(stack.empty() || stack.peek() != '[') {
                        return "no";
                    } else {
                        stack.pop();
                    }
                }
            }
            // 검사 마친 후
            // 스택이 비어있으면 -> "YES"
            if(stack.empty()) {
                return "yes";
            }
            // 스택이 비어있지 않으면 -> "NO"
            else {
                return "no";
            }
        }
   }