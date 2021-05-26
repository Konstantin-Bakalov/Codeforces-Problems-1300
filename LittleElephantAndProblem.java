import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/problemset/problem/220/A

public class LittleElephantAndProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a);
        int index1 = -1, index2 = -1;
        for(int i = 0; i < n; i++) {
            if(a[i] != b[i] && index1 == -1) index1 = i;
            else if(a[i] != b[i] && index1 != -1 && index2 == -1) index2 = i;
            else if(a[i] != b[i]){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
