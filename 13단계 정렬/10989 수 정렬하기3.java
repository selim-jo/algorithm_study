// 입력값: 자연수 N개의 줄에 주어지는 숫자
// 출력값: 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한줄에 하나씩 출력
// 메모리 초과 오류 발생 -> 해결법 찾아보기

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[n];

      List<Integer> list = new ArrayList<Integer>();

       // arr에 값을 넣음
       for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
       }
       
       // 오름차순 정렬
       Collections.sort(list);
       
       // 리스트 값 차례대로 출력
       Iterator iter = list.iterator(); // Iterator 선언
       while(iter.hasNext()) {
          System.out.println(iter.next());
       }
   }
}