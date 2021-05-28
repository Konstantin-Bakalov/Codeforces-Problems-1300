import java.util.Scanner;

// codeforces.com/problemset/problem/58/B

public class Coins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n > 0) {
            if(n == 1) {
                System.out.println(1);
                break;
            }
            for(int i = 2; i <= n; i++)
                if(n % i == 0) {
                    System.out.print(n + " ");
                    n /= i;
                    break;
                }
        }
    }
}
