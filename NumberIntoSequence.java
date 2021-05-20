import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// codeforces.com/problemset/problem/1454/D

public class NumberIntoSequence {

    static class Pair {
        public long p;
        public long a;
        Pair(long p, long a) {
            this.p = p;
            this.a = a;
        }
    }

    static class PairComparator implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.a < o2.a) return 1;
            if(o1.a > o2.a) return -1;
            if(o1.p < o2.p) return 1;
            if(o1.p > o2.p) return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            ArrayList<Pair> list = new ArrayList<>();
            long n = s.nextLong();
            for(long i = 2; i * i <= n; i++) {
                    int count = 0;
                    while(n % i == 0) {
                        count++;
                        n /= i;
                    }
                    if(count > 0) list.add(new Pair(i, count));
            }
            if(n > 1) list.add(new Pair(n, 1));
            Collections.sort(list, new PairComparator());
            long[] res = new long[(int)list.get(0).a];
            for(int i = 0; i < res.length; i++) res[i] = list.get(0).p;
            for(int i = 1; i < list.size(); i++) {
                Long j = list.get(i).a;
                while(j > 0) {
                    res[res.length - 1] *= list.get(i).p;
                    j--;
                }
            }
            System.out.println(res.length);
            for(long i : res) System.out.print(i + " ");
            System.out.println();
        }

    }
}
