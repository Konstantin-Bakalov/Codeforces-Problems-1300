import java.util.Scanner;

// codeforces.com/problemset/problem/1101/B

public class Accordion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int len = 0;
        int start_index = 0, end_index = str.length() - 1;
        while(start_index < str.length() - 1 && str.charAt(start_index) != '[') start_index++;
        while(end_index > 0 && str.charAt(end_index) != ']') end_index--;
        if(start_index == str.length() - 1 || end_index == 0 || start_index >= end_index) System.out.println(-1);
        else {
            len += 4;
            int firstColon = start_index + 1, lastColon = end_index - 1;
            while(firstColon < str.length() && str.charAt(firstColon) != ':') firstColon++;
            while(lastColon > 0 && str.charAt(lastColon) != ':') lastColon--;
            for(int i = firstColon + 1; i <= lastColon - 1; i++)
                if(str.charAt(i) == '|') len++;
            if(start_index < firstColon && firstColon < lastColon && lastColon < end_index)
                System.out.println(len);
            else System.out.println(-1);
        }
    }
}
