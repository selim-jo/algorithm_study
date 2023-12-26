// 입력값: 첫째줄에 단어의 갯수 n 주어짐
//     : 둘째줄부터 n개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어짐
// cf) 주어지는 문자열의 길이는 50을 넘지 않음
// 출력값: 아래 조건에 따라 정렬하여 단어 출력
// 조건 1) 길이가 짧은 것부터
// 조건 2) 길이가 같으면 사전 순으로
// 단, 중복된 단어는 하나만 남기고 제거해야 함

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextLine();
        }

        // 정렬 순서 출력
        // 내림차순으로 정렬하려면 인자로 Comparator를 넘겨줘야함
        // Comparable과 Comparator의 차이
        // Comparable: 자기 자신과 매개변수 비교, compareTo 메소드를 반드시 구현해야함
        // Comparator: 두 매개변수 객체 비교
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이 같은 경우
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    // s1이 s2보다 앞에 오게 하려면 음수, 뒤에 오게 하려면 양수 반환
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]);

        // 중복 제거
        for(int i=1; i<n; i++) {
            // 중복되지 않는 단어만 출력
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
   }
}