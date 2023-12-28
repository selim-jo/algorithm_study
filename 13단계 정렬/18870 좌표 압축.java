// 입력값: 첫째 줄에 n이 주어짐
//     : 둘째 줄에는 X1, X2, ..., Xn이 주어짐
// 출력값: 압축한 결과 출력 (X1', X2',..., XN')
// 문제 자체 이해가 안되었음
// 구글링해보니 각 원소의 순위를 매기는 것이라고 함
// 배열 정렬해서 map으로 순위 저장

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int n = sc.nextInt();

        int[] arr = new int[n]; // 원본 배열
        int[] sortedArr = new int[n]; // 정렬된 배열
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>(); // 압축 map

        // 배열 입력
        for(int i=0; i<n; i++) {
            arr[i] = sortedArr[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(sortedArr);

        // 배열 압축값을 map에 저장
        int rank = 0;

        for(int value : sortedArr) {
            if(!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }

        // 원본 배열의 순서대로 해당 압축 배열 출력
        // Scanner 사용시 시간초과 오류 발생
        StringBuilder sb = new StringBuilder();
        for(int value : arr) {
            sb.append(rankMap.get(value)).append(' ');
        }

        System.out.println(sb);
   }
}