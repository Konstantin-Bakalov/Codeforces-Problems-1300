import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1271/B

public class Blocks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        char[] a = str.toCharArray();
        ArrayList<Integer> index = new ArrayList<>();
        // try white first
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == 'B') {
                a[i] = 'W';
                if(a[i + 1] == 'W') a[i + 1] = 'B';
                else if(a[i + 1] == 'B') a[i + 1] = 'W';
                index.add(i);
            }
        }
        if(a[a.length - 2] == 'W' && a[a.length - 1] == 'W') {
            System.out.println(index.size());
            for(int i : index) System.out.print((i + 1) + " ");
            return;
        }
        a = str.toCharArray();
        index.clear();
        // try black next
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == 'W') {
                a[i] = 'B';
                if(a[i + 1] == 'W') a[i + 1] = 'B';
                else if(a[i + 1] == 'B') a[i + 1] = 'W';
                index.add(i);
            }
        }
        if(a[a.length - 2] == 'B' && a[a.length - 1] == 'B') {
            System.out.println(index.size());
            for(int i : index) System.out.print((i + 1) + " ");
        }
        else System.out.println(-1);
    }
}
