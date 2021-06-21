import java.util.HashMap;
import java.util.Scanner;

// codeforces.com/problemset/problem/4/C

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String name = null;
        for(int i = 0; i < n; i++) {
            name = s.next();
            if(!map.containsKey(name)) {
                map.put(name, 0);
                System.out.println("OK");
            }
            else {
                int index = map.get(name) + 1;
                map.put(name, index);
                System.out.println(name + index);
            }
        }
    }
}
