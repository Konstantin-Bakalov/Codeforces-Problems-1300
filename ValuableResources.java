import java.util.Scanner;

// codeforces.com/problemset/problem/485/B

public class ValuableResources {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max_x = Integer.MIN_VALUE, max_y = Integer.MIN_VALUE, min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if(x > max_x) max_x = x;
            if(x < min_x) min_x = x;
            if(y > max_y) max_y = y;
            if(y < min_y) min_y = y;
        }
        long d1 = max_x - min_x;
        long d2 = max_y - min_y;
        if(d1 == 0 && d2 != 0) System.out.println(d2 * d2);
        else if(d1 != 0 && d2 == 0) System.out.println(d1 * d1);
        else System.out.println(d1 > d2 ? d1 * d1 : d2 * d2 );
    }
}
