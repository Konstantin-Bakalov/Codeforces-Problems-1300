import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/318/B

public class StringsOfPower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] a = str.toCharArray();
        ArrayList<Integer> h = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();
        long res = 0;
        for(int i = 4; i < a.length; i++) {
            if(a[i - 4] == 'h' && a[i - 3] == 'e' && a[i - 2] == 'a' &&
                    a[i - 1] == 'v' && a[i] == 'y') h.add(i - 4);
            if(a[i - 4] == 'm' && a[i - 3] == 'e' && a[i - 2] == 't' &&
                    a[i - 1] == 'a' && a[i] == 'l') m.add(i - 4);
        }
        int index = 0;
        for(int i = 0; i < h.size(); i++) {
            while(index < m.size() && h.get(i) > m.get(index)) index++;
            res += m.size() - index;
        }
        System.out.println(res);
    }
}