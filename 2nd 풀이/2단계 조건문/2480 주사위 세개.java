public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 주사위 3개 눈 같을 때
        if(a == b && a == c) {
            System.out.println(10000 + a*1000);
        // 주사위 2개 눈 같을 때 (a == b or a == c)
        } else if(a == b && a != c || a == c && a != b) {
            System.out.println(1000 + a*100);
        // 주사위 2개 눈 같을 때 (b == c)
        } else if(b == c && b != a) {
            System.out.println(1000 + b*100);
        // 주사위 눈 다 다를 때
        } else {
            int max = a;
            if(max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.println(max * 100);
        }
   }
}