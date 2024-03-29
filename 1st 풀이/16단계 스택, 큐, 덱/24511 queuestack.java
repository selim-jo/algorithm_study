// 입력값: 첫째 줄에 queuestack을 구성하는 자료구조의 갯수 n이 주어짐
//       둘째 줄에 길이 n의 수열 A가 주어짐. i번 자료구조가 큐라면 Ai = 0, 스택이라면 Ai = 1
//       셋째 줄에 길이 n의 수열 B가 주어짐. Bi는 i번 자료구조에 들어있는 원소임 
//       넷째 줄에 삽입할 수열의 길이 m이 주어짐
//       다섯째 줄에 queuestack에 삽입할 원소를 담고 있는 길이 m의 수열 C가 주어짐
// 출력값: 수열 C의 원소를 차례대로 queuestack에 삽입했을 떄의 리턴값을 공백으로 구분하여 출력함

// 문제 자체가 이해 잘 안가 문제 접근법 참고
// ex) n = 4 -> 자료구조 4개
//     0 1 1 0 -> 각 자료구조의 종류 (큐라면 0, 스택이라면 1)
//     1 2 3 4 -> 현재 각 자료구조에 들어있는 수
//     m = 3 -> 넣을 수의 갯수
//     2 4 7 -> 넣을 수
// 문제를 정리하자면, 스택일 때는 아무일도 일어나지 않고, 큐일 경우에만 기존 요소를 갱신하고 뽑아냄
// 못품 (다음기회에 풀어보기)

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws IOException {
        
    }
}