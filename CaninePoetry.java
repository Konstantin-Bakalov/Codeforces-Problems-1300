import java.util.Scanner;

// codeforces.com/problemset/problem/1466/C

public class CaninePoetry {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            String str = s.next();
            int res = 0;
            boolean[] used = new boolean[str.length()];
            for(int i = 1; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(i - 1) && !used[i - 1])
                    used[i] = true;
                if(i >= 2 && str.charAt(i) == str.charAt(i - 2) && !used[i - 2])
                    used[i] = true;
                res += used[i] ? 1 : 0;
            }
            System.out.println(res);
        }
    }
}
