import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1165/C

public class GoodString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        ArrayList<Character> v = new ArrayList<>();
        char[] a = new char[n + 1];
        for(int i = 1; i <= n; i++) a[i] = str.charAt(i - 1);
        for(int i = 1; i <= n; i++) {
            if(v.size() == 0) v.add(a[i]);
            else if(v.size() % 2 == 1 && v.get(v.size() - 1) != a[i]) v.add(a[i]);
            else if(v.size() % 2 == 0) v.add(a[i]);
        }
        if(v.size() % 2 == 1) v.remove(v.size() - 1);
        System.out.println(n - v.size());
        for(char c : v) System.out.print(c);
    }
}