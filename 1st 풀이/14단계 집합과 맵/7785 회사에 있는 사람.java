// 입력값: 첫째줄에는 로그에 기록된 출입 기록의 수 n
//       다음 n개의 줄에는 출입 기록이 순서대로 주어짐
//      (각 사람의 이름이 주어지고, "enter"나 "leave"가 주어짐)
// 출력값: 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력

import java.util.*;

public class Main {
   public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //입력값
        int n = sc.nextInt();
        HashMap<String, String> hashMap = new HashMap<String, String>();

        for(int i=0; i<n; i++) {
            String name = sc.next();
            String status = sc.next();

            // 이름이 중복으로 있는 거는 퇴근한거니까 remove 해줌
            if(hashMap.containsKey(name)) {
                hashMap.remove(name);
            // 이름이 중복으로 없는 거는 회사에 있으므로 put 해줌
            } else {
                hashMap.put(name, status);
            }
        }

        // 역순으로 정렬
        ArrayList<String> list =new ArrayList<String>(hashMap.keySet());
        
        Collections.sort(list, Collections.reverseOrder());

        for(var li : list) {
            System.out.print(li + " ");
        }
        
   }
}