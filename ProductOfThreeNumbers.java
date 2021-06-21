import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1294/C

public class ProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int copy = n;
            for(int i = 2; i * i <= copy; i++) {
                if(list.size() == 2) break;
                if(copy % i == 0 && !list.contains(i)) {
                    list.add(i);
                    copy /= i;
                }
            }
            if(list.size() < 2) System.out.println("NO");
            else {
                int a = list.get(0);
                int b = list.get(1);
                int c = n / (a * b);
                if(a != b && b != c && a != c && a * b * c == n) {
                    System.out.println("YES");
                    System.out.println(a + " " + b + " " + c);
                }
                else System.out.println("NO");
            }
        }
    }
}
