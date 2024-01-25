// 입력값: 첫째 줄에 정수 k가 주어짐
//       k개의 줄에 정수가 1개씩 주어짐
//       정수가 0일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 씀
// cf) 정수가 0일 경우에 지울 수 있는 수가 있음을 보장할 수 있음
// 출력값: 최종적으로 적어 낸 수의 합 출력

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
        int k = sc.nextInt();

        // 출력값
        for(int i=0; i<k; i++) {

            int n = sc.nextInt();

            if(n == 0) {
                st.pop();
            } else {
                st.push(n);
            }
        }
        
        // 출력값 (최종 출력값)
        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        
        System.out.println(sum);
   }
}