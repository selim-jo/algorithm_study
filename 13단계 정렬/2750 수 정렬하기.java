// 입력값: 자연수 N개의 줄에 주어지는 숫자
// 출력값: 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한줄에 하나씩 출력
// 입력값은 중복되지 않음

import java.util.*;

public class Main {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] arr = new int[n];
       // set은 중복을 허용하지 않으나, 정렬 순서 보장x
       // list는 중복을 허용하나, 정렬 순서 보장o
       HashSet<Integer> hSet = new HashSet<Integer>();

       // HashSet에 배열값을 넣음
       for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            hSet.add(arr[i]);
       }
       
       // List로 변환후 오름차순 정렬
       List<Integer> li = new ArrayList<Integer>(hSet);
       Collections.sort(li);
       
       // 리스트 값 차례대로 출력
       Iterator iter = li.iterator(); // Iterator 선언
       while(iter.hasNext()) {
          System.out.println(iter.next());
       }
   }
}