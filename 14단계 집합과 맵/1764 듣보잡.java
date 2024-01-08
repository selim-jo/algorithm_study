// 입력값: 첫째줄에는 듣도 못한 사람의 수 n, 보도 못한 사람의 수 m이 주어짐
//       둘째줄부터 n개의 줄에 걸쳐 듣도 못한 사람의 이름과, 
//       n+2번째 줇부터 보도 못한 사람의 이름이 순서대로 주어짐
// cf) 듣도 못한 사람의 명단과 보도 못한 사람의 명단에는 중복되는 이름 없음
// 출력값: 듣보잡의 수와 그 명단을 사전순으로 출력
// 결국 듣도 못한 사람이 보도 못한 사람에 포함된 경우
// 또는 보도 못한 사람이 듣도 못한 사람에 포함된 경우를 구하라는 것

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);

      // 입력값
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      // 듣보 못한 사람 담는 곳
      HashSet<String> hashSet = new HashSet<>();
      
      // 듣도 못한 사람이 보도 못한 사람을 포함하면 담는 곳
      ArrayList<String> list = new ArrayList<String>();

      for(int i=0; i<n; i++) {
            hashSet.add(sc.next());
      }

      for(int i=0; i<m; i++) {
            String str = sc.next();
            if(hashSet.contains(str)) {
                list.add(str);
            }
      }

      // 출력값
      Collections.sort(list);
      
      System.out.println(list.size());

      for(String li : list) {
            System.out.println(li);
      }
   }
} 