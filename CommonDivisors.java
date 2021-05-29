import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
// codeforces.com/contest/1203/problem/C

public class CommonDivisors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<BigInteger> list = new ArrayList<>();
        for(int i = 0; i < n; i++) list.add(s.nextBigInteger());
        BigInteger res = list.get(0);
        for(int i = 1; i < n; i++) res = res.gcd(list.get(i));
        BigInteger ans = BigInteger.ZERO;
        BigInteger j = BigInteger.ONE;
        while(res.compareTo(j.multiply(j)) >= 0) {
            if(res.remainder(j) == BigInteger.ZERO) {
                ans = ans.add(BigInteger.ONE);
                if(j.compareTo(res.divide(j)) != 0) {
                    ans = ans.add(BigInteger.ONE);
                }
            }
            j =  j.add(BigInteger.ONE);
        }
        System.out.println(ans);
    }
}
