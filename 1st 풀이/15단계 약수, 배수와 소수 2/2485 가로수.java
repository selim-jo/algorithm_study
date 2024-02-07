// 입력값: 첫째 줄에는 이미 심어져 있는 가로수의 수를 나타내는 하나의 정수 n이 주어짐
//       둘째 줄부터 n개의 줄에는 각 줄마다 심어져 있는 가로수의 위치가 양의 정수로 주어짐
// 출력값; 모든 가로수가 같은 간격이 되도록 새로 심어야 하는 가로수의 최소수를 첫 번째 줄에 출력
// 유클리드 호제법 이용
// 간격들 중에 최대 공약수를 찾고, 전체 가로수의 수는 (최대위치 - 최소위치)/최대공약수+1
// 전체 가로수의 수에서 심어져 있는 수 빼서 결과값 구함
// 런타임 에러 뜸 -> 오류 해결법 찾아보기

import java.util.*;
import java.io.*;

public class Main {
   public static void main(String args[]) throws Exception {

        // 입력값
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        BufferedReader br = new BufferedReader(new inputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] rowNum = new int[n];

        for(int i=0; i<n; i++) {
            rowNum[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(rowNum);
        int gcd = 0;
        for(int i=0; i<n-1; i++) {
            int dist = rowNum[i+1] - rowNum[i];
            gcd = getGcd(dist, gcd);
        }

        // 일정 간격마다 심은 나무 수(전체 가로수의 수) - 이미 심은 나무 수
        System.out.println((rowNum[n-1]-rowNum[0])/gcd+1-(rowNum.length));
	}
	
    // 최대공약수 구하기
	public static int getGcd(int a, int b) {
		if(a%b == 0) {
			return b;
		}
		return getGcd(b, a%b);
	}
}