// 입력값: 첫째줄에는 상근이가 가지고 있는 숫자 카드의 개수 n
//       둘째줄에는 숫자 카드에 적혀있는 정수가 주어짐
// cf) 두 숫자 카드에 같은 수가 적혀있는 경우는 없음
//       셋째줄에는 m이 주어짐
//       넷째줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지 구해야 할 m개의 정수가 주어짐
// 출력값: 입력으로 주어진 m개의 수에 대해서, 
//       각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 
//       아니면 0을 공백으로 구분해 출력함

// hashSet 특징
// 1) 중복된 값 허용x
// 2) list와 다르게 순서가 보장x
// 3) null을 값으로 허용함

// Scanner를 사용했을 때 시간초과가 나옴. 다른 방법 생각해보기
// BufferReader와 StringTokenizer 이용
// But, 시간초과가 나옴

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) {
       try {
            //Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 입력값
            //int n = sc.nextInt();
            int n = Integer.parseInt(br.readLine());
            HashSet<Integer> hashSet = new HashSet<Integer>();
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            for(int i=0; i<n; i++) {
                    // hashSet add 메소드 이용해 값 넣어주기
                    //hashSet.add(sc.nextInt());
                    hashSet.add(Integer.parseInt(st1.nextToken()));
            }

            //int m = sc.nextInt();
            int m = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++) {
                    // hashSet contains 메소드 이용해 값 비교하기
                    if(hashSet.contains(Integer.parseInt(st2.nextToken()))) {
                        // 값이 있으면 1 출력
                        System.out.print(1);
                    } else {
                        // 값이 없으면 0 출력
                        System.out.print(0);
                    }
                    System.out.print(" ");
            }
                br.close();
        // 예외처리를 해주지 않으면 컴파일 에러 남
        } catch(IOException e) {
            e.printStackTrace();
        }
   }
} 