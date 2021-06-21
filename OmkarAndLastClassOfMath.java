import java.util.Scanner;

// codeforces.com/problemset/problem/1372/B

public class OmkarAndLastClassOfMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int p = 0;
            for (int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    p = i;
                    break;
                }
            }
            int k = 1;
            if(p >= 2) k = n / p;
            System.out.println(k + " " + (n - k));
        }
    }
}
