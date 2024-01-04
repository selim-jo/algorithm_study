// 입력값: 첫째줄에 포켓몬의 갯수 n, 맞춰야 하는 문제의 갯수 m
//       둘째줄부터 n개의 줄에 포켓몬의 번호가 1번~N번에 해당하는 포켓몬 입력
//       그 다음줄부터 총 m개의 줄에 맞춰야 하는 문제가 들어옴
// 출력값: 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고,
//       숫자로만 들어오면 포켓몬 번호에 해당하는 문자를 출력해야함

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //입력값
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            String name = sc.next();
            arr[i] = name;
            hashMap.put(name, i+1);
        }

        // 출력
        for(int i=0; i<m; i++) {
            // 입력값이 숫자이면
            if(sc.hasNextInt()) {
                // 그 번호에 해당하는 문자 출력
                System.out.println(arr[sc.nextInt()-1]);
            // 입력값이 문자이면
            } else {
                // 그 문자에 해당하는 번호 출력
                System.out.println(hashMap.get(sc.next()));
            }
        }
  
   }
}