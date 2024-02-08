public class Main {
   public static void main(String args[]) {
       
       Scanner sc = new Scanner(System.in);

       String A = sc.nextLine();
       String B = sc.nextLine();

       // 문자열을 숫자로(Integer.parseInt(문자열) 
       // 문자 자르기(substring)
       int a = Integer.parseInt(A);
       int q1 = Integer.parseInt(B.substring(2));
       int q10 = Integer.parseInt(B.substring(1,2));
       int q100 = Integer.parseInt(B.substring(0,1));

       System.out.println(a*q1);
       System.out.println(a*q10);
       System.out.println(a*q100);
       System.out.println((a*q1)+(a*q10*10)+(a*q100*100));
   }
}