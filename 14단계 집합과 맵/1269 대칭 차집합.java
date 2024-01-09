// 입력값: 첫째줄에는 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어짐
//       둘째줄에는 집합 A의 모든 원소가 빈 칸을 사이에 두고 주어짐
//       셋째줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 주어짐
// 출력값: 첫째줄에 대칭 차집합의 원소의 개수 출력
// 대칭 차집합이란?
// 두 집합 A,B에 대하여 A-B와 B-A의 합집합을 대칭 차집합이라고 함
// 즉 전체 두 개 원소 전체 집합에서 공통 빼준 것

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 입력값
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a 담는 곳
        HashSet<String> hashSet = new HashSet<>();

        // a와 b 교집합 담는 곳
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<a; i++) {
            hashSet.add(sc.next());
        }

        for(int i=0; i<b; i++) {
            String str = sc.next();
            if(hashSet.contains(str)) {
                list.add(str);
            }
        }

        // 교집합 갯수
        int comm = list.size();

        // 출력값
        System.out.println(a+b-(2*comm));
   }
} 