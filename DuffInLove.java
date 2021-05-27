import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/588/B

public class DuffInLove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        for(long i = 2; i * i <= n; i++) {
            long count = 0;
            while(n % i == 0) {
                count++;
                n /= i;
            }
            if(count > 0 && !list.contains(i)) list.add(i);
        }
        boolean prime = true;
        for(long i = 2; i * i <= n; i++)
            if(n % i == 0) {
                prime = false;
                break;
            }
        if(prime) list.add(n);
        long res = 1;
        for(long i : list) res *= i;
        System.out.println(res);
    }
}
