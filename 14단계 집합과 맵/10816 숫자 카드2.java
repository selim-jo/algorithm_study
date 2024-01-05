// 입력값: 첫째줄에는 상근이가 가지고 있는 숫자 카드의 개수 n
//       둘째줄에는 숫자 카드에 적혀있는 정수가 주어짐
//       셋째줄에는 m이 주어짐
//       넷째줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 m개의 정수가 주어짐
// 출력값: 입력으로 주어진 m개의 수에 대해서, 
//       각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) {
       try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 입력값
            int n = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int i=0; i<n; i++) {
                int key = Integer.parseInt(st.nextToken());
                // getOrDefault(key, defaultValue)
                // key에 대해 hashMap에 저장된 value 반환 (만약 value가 없을 경우 defaultValue 반환) 
                hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            }

            int m = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine(), " ");

            for(int i=0; i<m; i++) {
                int key = Integer.parseInt(st.nextToken());
                sb.append(hashMap.getOrDefault(key, 0)).append(' ');
            }
            System.out.println(sb);
        // 예외처리를 해주지 않으면 컴파일 에러 남
        } catch(IOException e) {
            e.printStackTrace();
        }
   }
} 