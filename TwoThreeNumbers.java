import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// codeforces.com/problemset/problem/926/A

public class TwoThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        Set<BigInteger> set = new TreeSet<>();
        for(int i = 0; i <= 30; i++) two.add((int)Math.pow(2, i));
        for(int i = 0; i <= 19; i++) three.add((int)Math.pow(3, i));
        for(int i = 0; i <= 30; i++) {
            for(int j = 0; j <= 19; j++) {
                BigInteger n = BigInteger.valueOf(two.get(i)).multiply(BigInteger.valueOf(three.get(j)));
                if(n.compareTo(BigInteger.valueOf(l)) >= 0 && n.compareTo(BigInteger.valueOf(r)) <= 0 ) set.add(n);
            }
        }
        System.out.println(set.size());
    }
}