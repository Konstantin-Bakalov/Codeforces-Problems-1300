import java.util.Scanner;

// codeforces.com/problemset/problem/1157/C1

public class IncreasingSubsequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        StringBuilder res = new StringBuilder();
        int index1 = 0, index2 = n - 1, last = 0;
        while(index1 <= index2) {
            int left = a[index1];
            int right = a[index2];
            if(left <= last && right <= last) break;
            if(left > last && right <= last) {
                index1++;
                last = left;
                res.append("L");
            }
            else if(right > last && left <= last) {
                index2--;
                last = right;
                res.append("R");
            }
            else if(left > last && right > last) {
                if(left < right) {
                    index1++;
                    last = left;
                    res.append("L");
                }
                else {
                    index2--;
                    last = right;
                    res.append("R");
                }
            }
        }
        System.out.println(res.length());
        System.out.println(res);
    }
}
