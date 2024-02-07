import java.io.*;

public class Main {
    // IOException은 inputStream==null일 경우 방지
   public static void main(String args[]) throws IOException {
       // BufferReader와 BufferWriter는 버퍼를 사용하여 읽기와 쓰기를 하는 함수
       // 버퍼를 사용하지 않는 입력은 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달됨
       // 버퍼를 사용하는 입력은 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송함
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int T = Integer.parseInt(br.readLine());
       
       for(int i=0; i<T; i++) {
            String s = br.readLine();
            int A = Integer.parseInt(s.split(" ")[0]);
            int B = Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B) + "\n");
       }
       bw.flush(); // 남아있는 데이터 모두 출력시킴
       bw.close(); // 스트림을 닫음
   }
}