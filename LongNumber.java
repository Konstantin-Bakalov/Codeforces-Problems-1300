import java.util.Scanner;

// codeforces.com/problemset/problem/1157/B

public class LongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        char[] b = str.toCharArray();
        int[] c = new int[n];
        for(int i = 0; i < n; i++) c[i] = b[i] - '0';
        int[] a = new int[10];
        for(int i = 1; i < 10; i++) a[i] = s.nextInt();
        for(int i = 0; i < n; i++) {
            if(c[i] < a[c[i]]) {
                int index = i;
                while(index < n && c[index] <= a[c[index]]) {
                    c[index] = a[c[index]];
                    index++;
                }
                break;
            }
        }
        for(int i : c) System.out.print(i);
    }
}