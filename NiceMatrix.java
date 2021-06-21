import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/1422/B

public class NiceMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            int boundM = m % 2 == 0 ? m / 2 : m / 2 + 1;
            int boundN = n % 2 == 0 ? n / 2 : n / 2 + 1;
            long res = 0;
            for(int i = 0; i < boundN; i++) {
                for(int j = 0; j < boundM; j++) {
                    int indexM = m - j - 1;
                    int indexN = n - i - 1;
                    ArrayList<Integer> v = new ArrayList<>();
                    v.add(a[i][j]);
                    if(j != indexM) v.add(a[i][indexM]);
                    if(i != indexN) v.add(a[indexN][j]);
                    if(i != indexN && j != indexM) v.add(a[indexN][indexM]);
                    Collections.sort(v);
                    int mid = v.get(v.size() / 2);
                    for(int k = 0; k < v.size(); k++) res += Math.abs(v.get(k) - mid);
                }
            }
            System.out.println(res);
        }
    }
}