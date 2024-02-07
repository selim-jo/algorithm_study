// 입력값: 첫째줄에 온라인저지 회원의 수 n 주어짐
//     : 둘째줄부터 n개의 줄에 각 회원의 나이와 이름이 공백으로 구분되어 주어짐
// cf) 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고
//     이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열임
//     입력은 가입한 순서로 주어짐
// 출력값: 첫째 줄부터 총 n개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 
//       나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int n = sc.nextInt();
        // 2차원 배열로 나이와 이름 받기
        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        // 정렬 순서 출력
        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순으로 정렬
            // compare 메소드를 사용하게 되면
            // 두 값을 처리한 리턴 결과가 음수, 0, 양수냐에 따라 
            // 첫번째 인자의 정렬순위가 낮음, 같은, 높음으로 정의될 수 있음
            // ex) 오름차순 7 > 5 => 자리바꿈 (왼쪽 값이 클 때)
            // ex) 내림차순 5 < 7 => 자리바꿈 (오른쪽 값이 클 때)
            // 반환값이 0 -> 두 객체의 위치를 바꾸지 않기 때문에 자연스럽게 입력순서로 정렬됨
            // 반환값이 양의 정수 -> 두 객체의 위치를 바꿔줌
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for(int i=0; i<n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
   }
}