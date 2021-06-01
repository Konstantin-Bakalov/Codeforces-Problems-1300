import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// codeforces.com/problemset/problem/1005/C

public class SummarizeToThePowerOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else
                map.put(a[i], 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            boolean b = false;
            for(int i = 0; i < 31; i++) {
                int m = (1 << i) - entry.getKey();
                if(m < 0) continue;
                if(entry.getKey() != m && map.containsKey(m)) {
                    b = true;
                    break;
                }
                if(entry.getKey() == m && entry.getValue() > 1) {
                    b = true;
                    break;
                }
            }
            if(!b) res += entry.getValue();

        }
        System.out.println(res);
    }
}
