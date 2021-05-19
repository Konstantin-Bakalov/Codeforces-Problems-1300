import java.util.Scanner;

// codeforces.com/problemset/problem/276/B

public class LittleGirlAndGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int[] a = new int[26];
        int even = 0, odd = 0;
        for(int i = 0; i < str.length(); i++) a[str.charAt(i) - 'a']++;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) even++;
            else odd++;
        }
        if(odd == 0) System.out.println("First");
        else System.out.println(odd % 2 == 1 ? "First" : "Second");
    }
}
