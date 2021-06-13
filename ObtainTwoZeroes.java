import java.util.Scanner;

// codeforces.com/problemset/problem/1260/B

public class ObtainTwoZeroes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if((a + b) % 3 == 0 && 2 *  a >= b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
